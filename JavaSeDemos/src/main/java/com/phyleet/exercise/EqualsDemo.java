package com.phyleet.exercise;


import java.lang.reflect.Field;

public class EqualsDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Integer a = new Integer(600);
        // Integer b = new Integer(600);
        // System.out.println(a == b);  // false
        // System.out.println(a.equals(b));
        //
        // Integer c = new Integer(12);
        // Integer d = new Integer(12);
        // System.out.println(c == d);
        // System.out.println(c.equals(d));
        //
        // Integer e = 127;
        // Integer f = 127;
        // Integer g = -128;
        // Integer h = -128;
        // System.out.println(e == f);
        // System.out.println(g == h);
        // System.out.println("===========================");

        // String string = "HelloWorld.";
        // System.out.println(string);
        //
        // Class<? extends String> aClass = string.getClass();
        // Field value = aClass.getDeclaredField("value");
        // value.setAccessible(true);
        // System.out.println(value);
        // System.out.println(value.get(string));

        // String str = "Hello";
        // addStr(str);
        // System.out.println(str);
        String s1 = new String("Hello");
        s1 = new String("world");
        System.out.println(s1);
    }

    // static String addStr(String string) {
    //     string += "Str";
    //     return string;
    // }
}
