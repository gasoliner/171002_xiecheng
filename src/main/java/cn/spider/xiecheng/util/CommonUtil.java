package cn.spider.xiecheng.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wanzhenghang on 2017/10/5.
 */
public class CommonUtil {
    public static String regexSingleString(String src,String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(src);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static String getValueByKeyInHtml(String src, String key) {
        Pattern pattern = Pattern.compile("(?:" + key + "\\s*=\\s*)" + "['\"](.*?)['\"]");
        Matcher matcher = pattern.matcher(src);
        if (matcher.find()) {
            return matcher.group().replaceAll(key + "\\s*=\\s*", "").replaceAll("\"", "");
        }
        return null;
    }
}
