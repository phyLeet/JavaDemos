package com.phyleet.fileIODemo.demo;

import com.phyleet.fileIODemo.util.FileUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class DemoMain {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(System.getProperty("user.dir"));

        String filePath = "D:/Develops/WorkSpace/casualDemos/tmp/abc.txt";
        String data = FileUtils.read3(filePath);
        // System.out.println(data);

        String filePath2 = "D:/Develops/WorkSpace/casualDemos/tmp/abc_1.txt";
        byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
        FileUtils.write(filePath2, dataBytes);
    }
}
