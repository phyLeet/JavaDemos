package com.phyleet.exercise.postfixCompletion;

import java.util.ArrayList;
import java.util.List;

public class HelloCompletion {

    private static User user;

    public static void main(String[] args) {
        /**
         * 变量创建
         */
        User user = new User(); // new User().var
        HelloCompletion.user = new User(); // new User().field
        // new User()   // User.new
        User user1 = (User) new Object();  // new Object().cast
        User user2 = (User) new Object();  // new Object().castvar


        /**
         * 各种类型的判断
         */
        if (user == null) {
            // user.null
        }
        if (user != null) {
            // user.notnull
        }
        if (user != null) {
            // user.nn
        }

        boolean flag = true;
        if (flag) {
            // flag.if
        }
        while (flag) {
            // flag.while
        }
        // !flag   // flag.not

        /**
         * 输出, 返回
         */
        System.out.println(flag); // flag.sout
        // return flag;  // flag.return

        /**
         * 循环
         */
        String[] strs = new String[5];
        for (int i = 0; i < strs.length; i++) {
            // strs.fori
        }
        for (String str : strs) {
            // strs.for
        }
        for (int i = strs.length - 1; i >= 0; i--) {
            // strs.forr
        }

        /**
         * 异常捕获
         */
        try {
            // main()  // main().try
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * 自定义 postfix completion
         */
        List<User> users = new ArrayList<>();  // User.list

        /**
         * Inject language
         * Alt+Enter 快捷键
         */

        //language=JSON
        String jsonStr = "{\"name\": \"phyleet\",\"age\":\"26\"}";

        //language=HTML
        String htmlStr = "<head>Hello inject language</head>";

        /**
         * 列编辑
         *  Shift+Enter 发现更多功能
         *  Ctrl+Shift+方向键 移动一行代码
         */

        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";

        String ss1 = s1 + "abc";
        String ss2 = s2 + "abc";
        String ss3 = s3 + "abc";
        String ss4 = s4 + "abc";
    }
}

class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
