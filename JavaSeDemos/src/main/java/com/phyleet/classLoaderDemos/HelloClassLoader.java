package com.phyleet.classLoaderDemos;

import com.phyleet.classLoaderDemos.entity.Student;

public class HelloClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();

        System.out.println(student.getClass().getClassLoader());
        System.out.println(student.getClass().getClassLoader().getParent());
        System.out.println(student.getClass().getClassLoader().getParent());

        System.out.println("===============");

        System.out.println(student.getClass().getClassLoader().getName());
        System.out.println(student.getClass().getClassLoader().getParent().getName());
        System.out.println(student.getClass().getClassLoader().getParent().getName());

        System.out.println("================");

        Class<?> aClass = Class.forName("com.phyleet.classLoaderDemos.entity.Person");
        System.out.println(aClass.getClassLoader());
        System.out.println(aClass.getClassLoader().getName());
    }
}
