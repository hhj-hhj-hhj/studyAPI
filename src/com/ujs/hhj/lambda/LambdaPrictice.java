package com.ujs.hhj.lambda;

import java.util.Arrays;

public class LambdaPrictice {
    public static void main(String[] args) {
        String[] arr = {"abc", "ab", "abcd", "a"};
        sortOfLen(arr);
        methodTest(() -> System.out.println("lambda表达式完全省略"));
    }
    static void methodTest(LambdaInterface lambdaInterface) {
        lambdaInterface.test();
    }
    private static void sortOfLen(String[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}

@FunctionalInterface
interface LambdaInterface {
    void test();
}
