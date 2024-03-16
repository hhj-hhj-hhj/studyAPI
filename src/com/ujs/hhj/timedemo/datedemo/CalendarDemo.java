package com.ujs.hhj.timedemo.datedemo;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
//        创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

//        获取年
        int year = calendar.get(Calendar.YEAR);
        System.out.println("年: " + year);
        calendar.add(Calendar.YEAR, 1);
        System.out.println("年: " + calendar.get(Calendar.YEAR));
    }
}
