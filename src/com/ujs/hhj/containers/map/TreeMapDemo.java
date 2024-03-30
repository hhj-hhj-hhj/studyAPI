package com.ujs.hhj.containers.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);

        TreeMap<Student, String> map = new TreeMap<>((o1, o2) -> {
            if (o1.age == o2.age) {
                return o2.name.compareTo(o1.name);
            } else {
                return o2.age - o1.age;
            }
        });

        map.put(s1, "beijing");
        map.put(s2, "shanghai");
        map.put(s3, "guangzhou");

        map.entrySet().forEach(System.out::println);
    }
}
