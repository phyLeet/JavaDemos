package com.phyleet.reflectDemos;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloReflect {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> targetClass = Class.forName("com.phyleet.reflectDemos.TargetObject");
        // TargetObject targetObject = (TargetObject) targetClass.newInstance();
        TargetObject targetObject = (TargetObject) targetClass.getDeclaredConstructor().newInstance();

        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject, "JavaGuide");

        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject, "JavaGuide111");

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
