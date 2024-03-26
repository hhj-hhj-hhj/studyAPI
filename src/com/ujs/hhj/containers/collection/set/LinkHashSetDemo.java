package com.ujs.hhj.containers.collection.set;

import java.util.LinkedHashSet;

public class LinkHashSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhangsan", 18);

        // LinkedHashSet是有序的，它是HashSet的子类，底层是由链表实现的
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        System.out.println(students.add(s1));
        System.out.println(students.add(s2));
        System.out.println(students.add(s3));
        System.out.println(students.add(s4));

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

