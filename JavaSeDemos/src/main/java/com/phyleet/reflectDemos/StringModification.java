package com.phyleet.reflectDemos;

import java.lang.reflect.Field;

public class StringModification {
    public static void main(String[] args) {
        String myStr = "初始化的String值";
        System.out.println(myStr);
        modifyVal(myStr);
        System.out.println("================>");
        System.out.println(myStr);
    }

    public static void modifyVal(String str) {
        Field field = null;
        try {
            field = str.getClass().getDeclaredField("value");
            field.setAccessible(true);
            field.set(str, field.get(str + " -->  修改后添加的值"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
