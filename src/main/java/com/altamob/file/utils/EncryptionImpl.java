package com.altamob.file.utils;

import com.google.common.base.Strings;;

public class EncryptionImpl implements Iencryption {
    @Override
    public String code(String source) {

        byte[] ret = null;
        if (!Strings.isNullOrEmpty(source = source.trim())) {
            byte[] bytes = source.getBytes();
            ret = new byte[bytes.length + 1];

            int length = ret.length;
            ret[0] = '-';
            for (int i = 1; i < length; i++) {
                ret[i] = bytes[i - 1];
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("decode(");
        stringBuilder.append("\"");
        stringBuilder.append(new String(ret));
        stringBuilder.append("\"");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public String decode(String str) {
        return null;
    }
}
