package com.phyleet.fileIODemo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileUtils {
    //读取方法，设定传参是文件的String路径，返回一个byte[]数组
    public static String read(String filePath) {
        byte[] bytes = new byte[0];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
            int read;
            bytes = new byte[1024];
            StringBuilder sb = new StringBuilder();
            System.out.println("内容读取中...");
            while ((fis.read(bytes) != -1)) {
                sb.append(new String(bytes, StandardCharsets.UTF_8));
            }
            System.out.println("内容读取完毕.");
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("关闭文件流...");
                fis.close();
                System.out.println("文件流已关闭.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //写入方法，需要两个参数，一是写入路径，一是写入内容
    public static void write(String filePath, byte[] bytes) {
        System.out.println("文件写入中...");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(filePath);
            try {
                fos.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件写入完毕.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("关闭文件流...");
                fos.close();
                System.out.println("文件流已关闭.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
