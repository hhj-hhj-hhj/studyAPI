package com.ujs.hhj.containers.collection.lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        init(list);
        forEach1(list);
        forEach2(list);
        forEach3(list);
    }
    private static void init(List<String> list) {
        list.add("hello");
        list.add("world");
        list.add("java");
    }

    private static void forEach3(List<String> list) {
        for(String s : list){
            System.out.println(s);
        }
    }

    private static void forEach2(List<String> list) {
        list.forEach(System.out::println);
    }

    private static void forEach1(List<String> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
