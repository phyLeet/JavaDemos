package com.phyleet.userDefinedAnnotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Class clazz = person.getClass();
        if (clazz.isAnnotationPresent(Info.class)) {
            System.out.println("Person类上配置了Info注解.");
            Info infoAnno = (Info) clazz.getAnnotation(Info.class);
            System.out.println("person.name: " + infoAnno.value() + ", person.isDelete: " + infoAnno.isDelete());
        } else {
            System.out.println("Person类上没有配置Info注解.");
        }
    }
}
