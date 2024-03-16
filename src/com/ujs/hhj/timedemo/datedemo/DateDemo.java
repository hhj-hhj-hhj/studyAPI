package com.ujs.hhj.timedemo.datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        getDate1();

        getDate2();

        getDate3();
    }

    private static void getDate3() {
        Date date1 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("日期: yyyy年MM月dd日\n时间: HH:mm:ss\n星期: EEE");
        String s2 = sdf2.format(date1);
        System.out.println(s2);
    }

    private static void getDate2() {
        Date date1 = new Date();
        //        利用SimpleDateFormat类格式化日期，指定格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = sdf1.format(date1);
        System.out.println(s1);
    }

    private static void getDate1() {
        Date date1 = new Date();
//        利用SimpleDateFormat类格式化日期，默认格式化日期的格式为：年-月-日 时:分:秒
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(date1);
        System.out.println(s);
    }
}
