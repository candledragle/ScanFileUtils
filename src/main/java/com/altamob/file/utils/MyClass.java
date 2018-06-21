package com.altamob.file.utils;


import com.google.common.base.Strings;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MyClass {

    public static String test = "/fffffffCommonUtils.dc(\"k7k7k7r=\"/*fffff*/)dddddddd\n";

    private static String FILE_TYPE = ".java";

    public static void main(String args[]) {

       // System.out.println(test = handleLine(test));
       /* boolean b = test.startsWith("/");
        if (b){
            System.out.println("da");
        }*/
        String test = "/home/sym/Desktop/AppsflyerSdk/FileUtilLib/src/main/java/com/altamob/file/utils/DeviceInfo"+FILE_TYPE;
        String path = "/home/sym/Desktop/src";


        try {
            traverseFolder2(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void traverseFolder2(String path) throws IOException {

        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {

                File[] files = file.listFiles();
                if (files.length == 0) {
                    System.out.println("文件夹是空的!");
                    return;
                } else {
                    for (File file2 : files) {
                        if (file2.isDirectory()) {
                            System.out.println("文件夹:" + file2.getAbsolutePath());
                            traverseFolder2(file2.getAbsolutePath());
                        } else {
                            String file1 = file2.getName();
                            if (file1.endsWith(FILE_TYPE)) {
                                System.out.println(file2.getAbsoluteFile());
                                scanStr(file2);
                            }
                        }
                    }
                }
            } else {
                if (file.getName().endsWith(FILE_TYPE)) {
                    System.out.println(file.getAbsoluteFile());
                    scanStr(file);
                }
            }

        } else {
            System.out.println("文件不存在!");
        }
    }


    public static void scanStr(File file) throws IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        CharArrayWriter temp = new CharArrayWriter();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {

            //跳过空行
            if (Strings.isNullOrEmpty(line)) {
                temp.append(System.getProperty("line.separator"));
                continue;
            } else if (line.trim().startsWith("/") || line.trim().startsWith("*")) {
                temp.write(line);
                temp.append(System.getProperty("line.separator"));
                continue;
            }

            String replace = handleLine(line);
            temp.write(replace);
            temp.append(System.getProperty("line.separator"));
        }
        bufferedReader.close();
        FileWriter out = new FileWriter(file);
        temp.writeTo(out);
        out.close();
    }

    private static String features01 = "CommonUtils.dc(";

    public static String handleLine(String src) {

        if (Strings.isNullOrEmpty(src.trim())) {
            return src;
        }

        char[] chars = src.toCharArray();

        StringBuilder ret = new StringBuilder();
        StringBuilder code = null;

        int[] seat = {0, 0};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\"') {

                //判断前一个字符是否是转译符号\
                if (i > 0) {

                    //判断feature01 特征
                    int length;
                    if (i >= (length = features01.length())) {
                        int pointer = i;
                        int poniterI = length;
                        boolean flag = true;
                        while (pointer > i - length) {
                            if (chars[pointer - 1] == features01.charAt(poniterI - 1)) {
                                pointer--;
                                poniterI--;
                            } else {
                                flag = false;
                                break;
                            }
                        }

                        if (flag) {
                            //包含特征feature01
                            return src;
                        }
                    }

                    if (chars[i - 1] == '\\') {
                        code.append(chars[i]);
                        //转译字符 继续
                        continue;
                    }
                }

                if (seat[0] == 0) {
                    seat[0] = i;
                    seat[1] = 0;
                    code = new StringBuilder();

                } else if (seat[1] == 0) {
                    seat[1] = i;
                    seat[0] = 0;
                }

                if (seat[1] != 0) {

                    //过滤掉空字符串
                    String str = code.toString();
                    if (Strings.isNullOrEmpty(str.trim())) {
                        ret.append("\"");
                        ret.append(str);
                        ret.append("\"");
                        continue;
                    }
                    //开始
                    ret.append('C');
                    ret.append('o');
                    ret.append('m');
                    ret.append('m');
                    ret.append('o');
                    ret.append('n');
                    ret.append('U');
                    ret.append('t');
                    ret.append('i');
                    ret.append('l');
                    ret.append('s');
                    ret.append('.');
                    ret.append('d');
                    ret.append('c');
                    ret.append('(');
                    ret.append('\"');

                    //内容
                    ret.append(EbcryptionUtils.ec(str));
                    ret.append('\"');

                    //注释
                    ret.append("/*");
                    ret.append(str);
                    ret.append("*/");
                    //
                    ret.append(')');

                }


            } else {

                if (seat[0] != 0) {
                    //开始
                    code.append(chars[i]);
                } else {
                    ret.append(chars[i]);
                }
            }

        }

        return ret.toString();
    }

}
