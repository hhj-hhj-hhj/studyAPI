package com.ujs.hhj.containers.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhangsan", 18);

        // TreeSet是有序的，它是Set接口的子类，底层是由红黑树实现的
//        创建对象时传入比较对象大小的lambda表达式
        lambdaSet(s1, s2, s3, s4);
        System.out.println("=====================================");
//        使用类内的compareTo方法
        comonSet(s1, s2, s3, s4);
    }
    private static void comonSet(Student s1, Student s2, Student s3, Student s4) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.forEach(System.out::println);
    }

    private static void lambdaSet(Student s1, Student s2, Student s3, Student s4) {
        TreeSet<Student> students = new TreeSet<>((o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getName().compareTo(o2.getName());
            }
            return o2.getAge() - o1.getAge();
        });
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.forEach(System.out::println);
    }
}
