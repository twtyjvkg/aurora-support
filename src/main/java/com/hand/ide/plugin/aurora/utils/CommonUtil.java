package com.hand.ide.plugin.aurora.utils;

/**
 * @author xuzhao
 * @email mailto:support@xuzhao.xin
 * @description
 * @time 2018/12/24 14:41
 */
public class CommonUtil {

    public static String camel2Underline(String line){

        StringBuilder sb = new StringBuilder(line);
        int temp = 0;//定位
        for(int i = 0;i < line.length();i++){
            if (Character.isUpperCase(line.charAt(i))){
                if (i != 0) {
                    sb.insert(i+temp, "_");
                    temp += 1;
                }
            }
        }
        return sb.toString().toLowerCase();
    }
}
