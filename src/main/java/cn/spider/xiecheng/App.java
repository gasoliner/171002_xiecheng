package cn.spider.xiecheng;

import cn.spider.xiecheng.pageProcessor.XiechengPageProcessor;
import us.codecraft.webmagic.Spider;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Spider.create(new XiechengPageProcessor())
                .addUrl(
                        "http://vacations.ctrip.com/tours/d-unitedstates-100047/grouptravel/p1#_flta"
                )
                .thread(1)
                .run();
    }
}
