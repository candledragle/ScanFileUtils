package com.altamob.file.utils;

public class EbcryptionUtils {

    public static String dc(byte[] input) {
        try {

            int len = input.length, p = 0, value = 0, op = 0;
            byte[] output = new byte[len * 3 / 4], alphabet
                    = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 36, 0, 13, 42, 5, 58, 21, 62, 63, 15, 38, 32,
                    7, 0, 0, 0, 0, 0, 0, 0, 61, 39, 35, 11, 46, 9, 56, 27, 48,
                    33, 52, 34, 54, 19, 44, 47, 40, 31, 4, 8, 6, 2, 29, 0, 57,
                    59, 0, 0, 0, 0, 0, 0, 23, 17, 12, 49, 20, 55, 50, 43, 51,
                    41, 25, 16, 53, 18, 26, 30, 28, 24, 3, 22, 1, 60, 45, 10,
                    14, 37, 0, 0, 0, 0, 0};
            while (p + 4 <= len
                    && (value = ((alphabet[input[p] & 0xff] << 18)
                    | (alphabet[input[p + 1] & 0xff] << 12)
                    | (alphabet[input[p + 2] & 0xff] << 6)
                    | (alphabet[input[p + 3] & 0xff]))) >= 0) {
                output[op + 2] = (byte) value;
                output[op + 1] = (byte) (value >> 8);
                output[op] = (byte) (value >> 16);
                op += 3;
                p += 4;
            }
            return new String(output, "US-ASCII").trim();
        } catch (Exception e) {
        }
        return "";
    }

    // 编码
    public static String ec(String enstr) {
        try {
            byte[] input = enstr.getBytes();
            int len = input.length, output_len = len / 3 * 4;
            if (len % 3 > 0) {
                output_len += 4;
            }
            byte[] output = new byte[output_len];
            int[] alphabet = {88, 117, 86, 115, 83, 49, 85, 57, 84, 70,
                    120, 68, 99, 47, 121, 54, 108, 98, 110, 78, 101, 51, 116,
                    97, 114, 107, 111, 72, 113, 87, 112, 82, 56, 74, 76, 67, 45,
                    122, 55, 66, 81, 106, 48, 104, 79, 119, 69, 80, 73, 100,
                    103, 105, 75, 109, 77, 102, 71, 89, 50, 90, 118, 65, 52, 53};
            int op = 0, v, p = 0;
            while (p + 3 <= len) {
                v = ((input[p] & 0xff) << 16)
                        | ((input[p + 1] & 0xff) << 8)
                        | (input[p + 2] & 0xff);
                output[op] = (byte) alphabet[(v >> 18) & 0x3f];
                output[op + 1] = (byte) alphabet[(v >> 12) & 0x3f];
                output[op + 2] = (byte) alphabet[(v >> 6) & 0x3f];
                output[op + 3] = (byte) alphabet[v & 0x3f];
                p += 3;
                op += 4;
            }
            if (len - 1 == p) {
                int t = 0;
                v = (input[p++] & 0xff) << 4;
                output[op++] = (byte) alphabet[(v >> 6) & 0x3f];
                output[op++] = (byte) alphabet[v & 0x3f];
                output[op++] = '=';
                output[op++] = '=';
            } else if (len - 2 == p) {
                int t = 0;
                v = ((input[p++] & 0xff) << 10)
                        | ((input[p++] & 0xff) << 2);
                output[op++] = (byte) alphabet[(v >> 12) & 0x3f];
                output[op++] = (byte) alphabet[(v >> 6) & 0x3f];
                output[op++] = (byte) alphabet[v & 0x3f];
                output[op++] = '=';
            }
            String result = new String(output, "US-ASCII").trim();
            System.out.println(enstr + "\n" + result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 解码
    public static String dc(String dcstr) {
        return dc(dcstr.getBytes());
    }
}
