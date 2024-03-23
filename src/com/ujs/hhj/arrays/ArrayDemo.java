package com.ujs.hhj.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {
    public static void main(String[] args) {
        copy();
        fill();
        sort();

    }

    private static void sort() {
        System.out.println("-----sort-----");
        Integer[] arr = {1, 4, 5, 3, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    private static void fill() {
        System.out.println("-----fill-----");
        int[] arr = new int[5];
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void copy() {
        System.out.println("-----copy-----");
        int[] arr = {1, 2, 3};
        int[] arr2 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr3));
    }
}
