package cn.spider.xiecheng.pageProcessor;

import cn.spider.xiecheng.po.*;
import cn.spider.xiecheng.util.CommonUtil;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.HttpRequestBody;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.utils.HttpConstant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanzhenghang on 2017/10/3.
 * 难点：
 *  1.不同站的问题，比如，选择北京站，潍坊站，他显示的数量不同的，好多个城市又有许多重复的。
 *  2.addHeader("Cookie","")现在是自己加，能不能让机器自己去。
 *  3.同一个资源，服务器有多种显示方式，所以你的爬取方式必须涵盖所有的方式。
 *  4.一个完整资源（product）需要在多次请求中，可以用到request.setExtra(Map)来把第一次获取的信息放进request里，在爬取了这个request时，再取出来，与剩下的资源整合成一个资源。
 */
public class XiechengPageProcessor implements PageProcessor {

    private static String DOMAIN = "vacations\\.ctrip\\.com";
    private static String LIST = DOMAIN + "/tours/d-unitedstates-100047/grouptravel/p\\d";
    private static String DETAIL = DOMAIN + "/grouptravel/p[a-zA-Z0-9]+\\.html";
    private static String PRODUCT = DOMAIN + "/tour-mainsite-vacations/api/product";

    private Site site =
            Site.me()
//                    .addHeader("referer","http://qzs.qq.com/qzone/app/mood_v6/html/index.html")
                    .addHeader("Cookie",
                            ""
                    )
                    .setRetryTimes(3)
                    .setSleepTime(10000)
                    .setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");


    public void process(Page page) {
        /***
         * resource:
         *  下一页URL
         *  DETAIL_URL
         *  id
         */
        if (page.getUrl().regex(LIST).match()) {
            System.out.println("LIST_VIEW");
            List<String> resultJson = page.getHtml().xpath("//div[@class='main_mod']/textarea/tidyText()").all();
            List<ProductParams> paramsList =
                    new ArrayList<>();
            for (String string:
                 resultJson) {
                ListTextarea textarea = JSON.parseObject(string, ListTextarea.class);
//                添加一个product到Map里
                CtripProduct product =
                        new CtripProduct();
                product.setId(textarea.getId());
                product.setName(textarea.getName());
                new TempProduct().add(textarea.getId(),product);
//                装填ParamsList
                ProductParams params =
                        new ProductParams();
                params.setId(textarea.getId());
                params.setBu(textarea.getBu());
                params.setDid(textarea.getDepartureId());
                paramsList.add(params);
            }
//            构建POST请求，把ProductParams的List封装成Request，放入URL队列
            Map<String,String> map = new HashMap<>();
            map.put("params",JSON.toJSONString(paramsList));
            map.put("keyword","美国");
            page.addTargetRequest(postMethod_form(
                    "http://vacations.ctrip.com/tour-mainsite-vacations/api/product"
                    ,map));

//            System.out.println(textareaList);

            setURLByPageContent(LIST,page);
            setURLByPageContent(DETAIL,page);
        }

        if (page.getUrl().regex(PRODUCT).match()) {
            System.out.println("PRODUCT_VIEW");
            List<Product> productList = JSON.parseArray(page.getJson().toString(),Product.class);
            for (Product product:
                 productList) {
                CtripProduct ctripProduct = TempProduct.getOne(product.getProductId());
                ctripProduct.setDp_place(product.getDepartureCityName());
                ctripProduct.setPrice(Long.parseLong(CommonUtil.regexSingleString(product.getPrice(),"\\d+")));
                ctripProduct.setSupplier(product.getVendorName());
                ctripProduct.setScore(product.getScore());
                ctripProduct.setTravelCount(product.getTravelCount());
                ctripProduct.setCommentsCount(product.getCommentCount());
                TempProduct.add(ctripProduct.getId(),ctripProduct);
                System.out.println("ctripProduct:\t" + ctripProduct);
            }
        }

        if (page.getUrl().regex(DETAIL).match()) {
            /***
             * <a pid="18162689" class="inner_current"> <i> </i> A线: 洛进纽出 </a> 的pid
             */
            CtripProduct ctripProduct =
                    TempProduct.getOne(Long.parseLong(CommonUtil.regexSingleString(page.getHtml().xpath("//li[@class='product_num']/text()").get(),"\\d+")));
            String diamond = CommonUtil.getValueByKeyInHtml(page.getHtml().xpath("//h1[@itemprop='name']/outerHtml()").get(),"class");
            diamond = diamond.replaceAll("diamond_","");
            ctripProduct.setDiamond(Integer.parseInt(diamond));
            /***
             * 判断是否为AB线：
             * <input type="hidden" id="IsMoreJourney" value="false" />
             */
            String isAB = page.getHtml().$("#IsMoreJourney").get();
            System.out.println("isAB:\tIsMoreJourney\t" + isAB);

            if (isAB != null) {
                ctripProduct.setAB(true);

            }
            System.out.println(ctripProduct);
        }

    }

    private Request postMethod_form(String url, Map map) {
        Request request = new Request(url);
        request.setMethod(HttpConstant.Method.POST);
        request.setRequestBody( HttpRequestBody.form(map,"utf-8"));
        return request;
    }



    private void setURLByPageContent (String regex, Page page) {
        page.addTargetRequests(page.getHtml().links().regex(regex).all());
    }

    public Site getSite() {
        return site;
    }
}
