package com.ujs.hhj.containers.map;

import java.util.HashMap;
import java.util.Objects;

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

class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age == o.age) {
            return this.name.compareTo(o.name);
        } else {
            return this.age - o.age;
        }
    }
}