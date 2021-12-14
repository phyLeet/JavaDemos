package com.phyleet.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("aKey", "aValue");
        map.put(null, "null value");
        // System.out.println(map.get(null));
        // System.out.println(map.get("aKey"));

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().getKey();
            System.out.println(iterator.next());
            System.out.println("key --> " + key);
            System.out.println("value --> " + map.get(key));
        }

    }
}
