package com.phyleet.fileIODemo.util;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    //读取方法，设定传参是文件的String路径，读取到一个byte[]数组
    public static String read1(String filePath) {
        InputStreamReader reader = null;
        BufferedReader br = null;
        try {
            reader = new InputStreamReader(new FileInputStream(new File(filePath)), StandardCharsets.UTF_8);
            br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            System.out.println("内容读取中...");
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.println("内容读取完毕.");
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("关闭文件流...");
                br.close();
                reader.close();
                System.out.println("文件流已关闭.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //读取方法，设定传参是文件的String路径，读取到一个byte[]数组
    public static String read2(String filePath) {
        FileInputStream in = null;
        try {
            File file = new File(filePath);
            in = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()]; //只适用于小文件
            System.out.println("内容读取中...");
            in.read(bytes);
            System.out.println("内容读取完毕.");
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("关闭文件流...");
                in.close();
                System.out.println("文件流已关闭.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //读取方法，设定传参是文件的String路径，分块读取到一个byte[]数组
    public static String read3(String str) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(str);
            int read;
            byte[] bytes = new byte[1024];
            StringBuilder sb = new StringBuilder();
            System.out.println("内容读取中...........");
            while ((read = fis.read(bytes)) != -1) {
                System.out.println("read = " + read);
                sb.append(new String(bytes, StandardCharsets.UTF_8)); //无法完整读取, 待解决. 分块拆分边界问题？
            }
            System.out.println("内容读取完毕.");
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    System.out.println("关闭文件流...");
                    fis.close();
                    System.out.println("文件流已关闭.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //JDK >= 11
    public static String read4(String filePath) {
        try {
            Path path = Paths.get(filePath);
            System.out.println("内容读取中...");
            String data = Files.readString(path, StandardCharsets.UTF_8);
            System.out.println("内容读取完毕.");
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //JDK = 8
    public static String read5(String filePath) {
        try {
            Path path = Paths.get(filePath);
            System.out.println("内容读取中...");
            List<String> dataList = Files.readAllLines(path, StandardCharsets.UTF_8);
            System.out.println("内容读取完毕.");
            String data = StringUtils.join(dataList, "\n");
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //JDK = 8
    public static String read6(String filePath) {
        try {
            Path path = Paths.get(filePath);
            System.out.println("内容读取中...");
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("内容读取完毕.");
            String data = new String(bytes, StandardCharsets.UTF_8);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
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
