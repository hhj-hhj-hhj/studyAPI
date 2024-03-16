package com.ujs.hhj.patterndemo;

public class StringPattern {
    public static void main(String[] args) {

//        tihuan();
//        fenge();

    }

    private static void fenge() {
        String str = "胡伽琪abcde 黄宏进def 真老师";
        String[] s = str.split("[ \\w&&[^_]]+");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }

    private static void tihuan() {
        //        替换
        String str = "胡伽琪abcde 黄宏进def 真老师";
        String s = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s);
    }
}
