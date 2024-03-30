package com.ujs.hhj.containers.map;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo {
    public static void main(String[] args) {
//        V put(K key, V value)：将指定的值与此映射中的指定键相关联（可选操作）。
//        V get(Object key)：返回到指定键所映射的值，或者如果此映射不包含该键的映射，则返回 null。
//        void clear()：从此映射中移除所有映射关系（可选操作）。
//        boolean containsKey(Object key)：如果此映射包含指定键的映射关系，则返回 true。
//        boolean containsValue(Object value)：如果此映射将一个或多个键映射到指定值，则返回 true。
//        boolean isEmpty()：如果此映射未包含键-值映射关系，则返回 true。
//        Set<K> keySet()：返回此映射中包含的键的 Set 视图。
//        V remove(Object key)：如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
//        int size()：返回此映射中的键-值映射关系数。

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        printMap(map);

        base(map);
    }

    private static void printMap(Map<String, String> map) {
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);

        map.entrySet().forEach(System.out::println);
    }

    private static void base(Map<String, String> map) {
        System.out.println(map);
        System.out.println(map.put("1", "d"));

        System.out.println(map.get("1"));

        System.out.println(map.remove("1"));

        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("b"));

        System.out.println(map.size());
    }
}
