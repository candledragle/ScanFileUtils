package com.altamob.file.utils;

public interface Iencryption {

    /**
     * 返回加密后的字符串
     *
     * @param source 待加密字符串
     * @return
     */
    public String code(String source);

    /**
     * 解密
     *
     * @param str
     * @return
     */
    public String decode(String str);
}
