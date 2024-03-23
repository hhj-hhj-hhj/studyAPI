package com.ujs.hhj.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        fun1();
        fun2();
    }

    private static void fun2() {
        System.out.println("-------lambda表达式-------");
        Integer[] arr = {1, 4, 5, 3, 2};
        Arrays.sort(arr, (o1, o2) -> {
            return o2 - o1;});
        System.out.println(Arrays.toString(arr));
    }

    private static void fun1() {
        System.out.println("-------匿名内部类形式-------");
        Integer[] arr = {1, 4, 5, 3, 2};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
