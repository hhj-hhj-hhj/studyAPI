package com.ujs.hhj.containers.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhangsan", 18);
        HashSet<Student> students = new HashSet<>();
        System.out.println(students.add(s1));
        System.out.println(students.add(s2));
        System.out.println(students.add(s3));
//        如果没重写hashCode和equals方法，s4会被添加进去，因为它们的地址不同，而默认的hashCode和equals方法是比较地址的
        System.out.println(students.add(s4));
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Student)obj).name) && this.age == ((Student)obj).age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}