package com.ujs.hhj.containers.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);

        HashMap<Student, String> map = new HashMap<>();

        map.put(s1, "beijing");
        map.put(s2, "shanghai");
        map.put(s3, "guangzhou");

        System.out.println("------------------");
        map.entrySet().forEach(System.out::println);
    }
}

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}