package cn.spider.xiecheng;

import cn.spider.xiecheng.po.ListTextarea;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wanzhenghang on 2017/10/3.
 */
public class MyTest {
    private boolean regex(String regex,String string) {
//        Pattern pattern = Pattern.compile("vacations\\.ctrip\\.com/grouptravel/p\\d*\\.html[\\S\\s]*");
        Pattern pattern = Pattern.compile("vacations\\.ctrip\\.com/grouptravel/p[a-zA-Z0-9]+\\.html");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
    @Test
    public void test1 () {
        String DETAIL = "vacations\\.ctrip\\.com/grouptravel/p\\d*\\.html[\\S\\s]*";
        String DETAIL1 = "http://vacations.ctrip.com/grouptravel/p18094962s475.html?kwd=%e7%be%8e%e5%9b%bd";
        System.out.println(regex(DETAIL,DETAIL1));
    }

    @Test
    public void test2 () {
        String var1 =
                "{\"Id\":17435085,\"Name\":\"美国塞班岛5日4晚半自助·杭州直飞+纯玩不进店+免签证+环岛游+军舰岛\",\"PackageName\":\"\",\"Level\":0,\"Bu\":\"GT\",\"Url\":\"//vacations.ctrip.com/grouptravel/p17435085s475.html?kwd=%e7%be%8e%e5%9b%bd\",\"DepartureId\":7,\"Count\":16,\"SaleMode\":\"R\",\"SoldOut\":false,\"BrandName\":\"零售商：<span \n" +
                        "class='retail_gray'>由</span>深圳中之旅旗舰店<span \n" +
                        "class='retail_gray'>直售，并提供咨询/预订/售后服务</span>\",\"Schedule\":\"<em \n" +
                        "class='date'>国庆</em>\",\"Festival\":\"国庆\",\"IsCircleLine\":false,\"CssName\":\"sr_semibuffet\",\"TypeName\":\"半自助游\",\"IsFirst\":false,\"Type\":2048}\n";
        JSON.parseObject(var1, ListTextarea.class);
    }
}
