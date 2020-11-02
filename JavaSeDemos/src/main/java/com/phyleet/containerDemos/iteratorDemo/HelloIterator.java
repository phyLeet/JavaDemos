package com.phyleet.containerDemos.iteratorDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HelloIterator {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Python");
        map.put(4, "Spring");
        map.put(5, "Spring");
        map.put(6, "Redis");
        map.put(7, "Kafka");

        System.out.println(map);
        System.out.println(map.entrySet());

        //第一种遍历方法
        Iterator<Map.Entry<Integer, String>> iterator1 = map.entrySet().iterator();
        System.out.println("==================================");
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        //第二种遍历方法
        Iterator<Integer> iterator2 = map.keySet().iterator();
        System.out.println("==================================");
        while (iterator2.hasNext()) {
            Integer key = iterator2.next();
            System.out.println(key + " --> " + map.get(key));
        }

        //第三种遍历方法
        System.out.println("==================================");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        //第四种遍历方法
        System.out.println("==================================");
        for (Integer key : map.keySet()) {
            System.out.println(key + " --> " + map.get(key));
        }

        //第五种遍历方法
        System.out.println("==================================");
        map.forEach((key, value) -> System.out.println(key + " --> " + value));

        //第六种遍历方法
        System.out.println("==================================");
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " --> " + entry.getValue()));

        //第七种遍历方法
        System.out.println("==================================");
        map.entrySet().parallelStream().forEach(entry -> System.out.println(entry.getKey() + " --> " + entry.getValue()));
    }
}
