
package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

import java.util.StringTokenizer;

/**
 * 字符串工具类
 */
public class StringUtil {
    /*
     * 判断字符串是否为空
     * */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /*
     * 判断字符串是否非空
     * */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /*
     * 切割字符串
     * */
    public static String[] splitString(String var0, String var1) {
        StringTokenizer var2 = new StringTokenizer(var0, var1);
        String[] var3 = new String[var2.countTokens()];

        for (int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = var2.nextToken();
        }

        return var3;
    }
}