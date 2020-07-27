package zy.com.cn.sicily.web.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @title: Md5Encrypt
 * @description: Md5加密
 * @author: zhangyan
 * @date: 2020-07-24 16:18
 * @version: 1.0
 **/
public class Md5Encrypt {
    /**
     * Used building output as Hex
     */
    private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    /**
     * 对字符串进行MD5加密
     * @param text  明文
     * @return 密文
     */
    public static String md5(String text) {
        MessageDigest msgDigest = null;
        try {
            msgDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(
                    "System doesn't support MD5 algorithm.");
        }
        try {
            msgDigest.update(text.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(
                    "System doesn't support your  EncodingException.");
        }
        byte[] bytes = msgDigest.digest();
        String md5Str = new String(encodeHex(bytes));
        return md5Str;
    }

    //编码进制
    public static char[] encodeHex(byte[] data) {
        int l = data.length;
        char[] out = new char[l << 1];
        // two characters form the hex value.
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            out[j++] = DIGITS[0x0F & data[i]];
        }
        return out;
    }
}
