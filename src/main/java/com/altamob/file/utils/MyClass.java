package com.altamob.file.utils;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {

    private static String test = "/fffffffCommonUtils.dc(\"k7k7k7r=\"/*fffff*/)dddddddd\n";

    private static String FILE_TYPE = ".java";

    private static final String test1 = "/home/sym/Desktop/AppsflyerSdk/FileUtilLib/src/main/java/com/altamob/file/utils/DeviceInfo" + FILE_TYPE;
    private static String path = "/home/sym/Desktop/src";

    public static void main(String args[]) {

        // System.out.println(test = handleLine(test));
       /* boolean b = test.startsWith("/");
        if (b){
            System.out.println("da");
        }*/

        if (args.length > 0) {
            path = args[0];
            System.out.println(path);
        } else {
            System.out.println("请输入路径");
        }


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
                                if (file2.getName().equals(FILE_NAME)) {
                                    if (file2.getAbsoluteFile().toString().contains("com" + File.separator + "mobi" + File.separator + "sdk" + File.separator + "utils." + FILE_NAME)) {
                                        continue;
                                    }
                                }

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
            if (line == null || line.isEmpty()) {
                temp.append(System.getProperty("line.separator"));
                continue;
            } else if (line.trim().startsWith("/")
                    || line.trim().startsWith("*")
                    || line.trim().startsWith("@")) {

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

    private static final String FILE_NAME = "EncryptUtils";

    private static String FEATURES_01 = FILE_NAME + ".dc(";

    public static String handleLine(String src) {

        if (isNullOrEmpty(src.trim())) {
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
                    if (i >= (length = FEATURES_01.length())) {
                        int pointer = i;
                        int poniterI = length;
                        boolean flag = true;
                        while (pointer > i - length) {
                            if (chars[pointer - 1] == FEATURES_01.charAt(poniterI - 1)) {
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
                    if (isNullOrEmpty(str.trim())) {
                        ret.append("\"");
                        ret.append(str);
                        ret.append("\"");
                        continue;
                    }
                    //开始
                    ret.append(FILE_NAME + ".dc(\"");

                    //内容
                    ret.append(EbcryptionUtils.ec(str));
                    ret.append('\"');

                    //注释
                    ret.append("/*");
                    ret.append(str);
                    ret.append("*/)");
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

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

}
