package com.ujs.hhj.timedemo.patterndemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
//        method1();
//        fenzu();
        isTanlan();
    }

    private static void isTanlan() {
        String str = "abbb abbbb a abbb aaaaaa";
        Pattern p1 = Pattern.compile("ab+");
        Pattern p2 = Pattern.compile("ab+?");

        Matcher m = p1.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    private static void fenzu() {
        String str = "JAVA8在3 jaVa11在2 JavA17在1 java一个人";

        Pattern p1 = Pattern.compile("((?i)java)(?=8|11|17)");
        Pattern p2 = Pattern.compile("((?i)java)(?:8|11|17)");
        Pattern p3 = Pattern.compile("((?i)java)(8|11|17).{3}");

        Matcher m = p3.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    private static void method1() {
        String str = "Hello World 123Hello World 321Hello World 132Hello World 231";

        // 匹配Hello World 123
//        System.out.println(str.matches(".*Hello World 123.*"));
        Pattern p = Pattern.compile("Hello World \\d*");

        Matcher m = p.matcher(str);
        boolean b = m.matches();
        System.out.println(b);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
