package com.phyleet.exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world.");
        int a = 44;
        float b = a;
        System.out.println("b --> " + b);
        // for (int i = 0; i < 128; i++) {
        //     System.out.print((char) i + " ");
        // }
        String s = "abcdefgh";
        System.out.println(s.substring(0, s.length() - 1));
        String str1 = new String("abcdefg");
        String str2 = new String("abcdefg");
        System.out.println(str1 == str2);
        System.out.println(Objects.equals(str1, str2));
        System.out.println(str1.intern() == str2.intern());
        System.out.println("==============");
        Integer aa = 34;
        Integer bb = 34;
        Integer cc = 129;
        Integer dd = 129;
        Integer ee = new Integer(34);
        Integer ff = new Integer(34);
        System.out.println(aa == bb);
        System.out.println(dd == cc);
        System.out.println(dd.equals(cc));
        System.out.println("----------");
        System.out.println(ee==ff);
        System.out.println(ee.equals(ff));
    }
}
