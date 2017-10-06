package cn.spider.xiecheng.po;

import java.util.HashMap;

/**
 * Created by wanzhenghang on 2017/10/5.
 */
public class TempProduct {
    public static HashMap<Long,CtripProduct> productHashMap =
            new HashMap<>();
    public static void add(Long id,CtripProduct product) {
        productHashMap.put(id,product);
    }
    public static CtripProduct getOne(Long id) {
        return productHashMap.get(id);
    }
    public static int getSize() {
        return productHashMap.size();
    }
}
