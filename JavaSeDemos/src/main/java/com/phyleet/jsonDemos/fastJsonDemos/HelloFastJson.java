package com.phyleet.jsonDemos.fastJsonDemos;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloFastJson {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("string", "string");
        object.put("int", 2);
        object.put("boolean", true);
        List<Integer> integers = Arrays.asList(1, 2, 3);
        object.put("list", integers);
        object.put("null", null);
        System.out.println(object);

        String s = object.getString("string");
        System.out.println(s);

        int i = object.getIntValue("int");
        System.out.println(i);

        boolean b = object.getBooleanValue("boolean");
        System.out.println(b);

        List<Integer> ints = JSON.parseArray(object.getJSONArray("list").toJSONString(), Integer.class);
        System.out.println(ints);

        System.out.println(object.getString("null"));

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        String jsonStr = JSON.toJSONString(map);
        System.out.println(map);
        System.out.println(jsonStr);
    }
}
