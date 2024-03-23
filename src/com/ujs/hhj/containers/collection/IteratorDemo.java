package com.ujs.hhj.containers.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java");
        Iterator<String> it = list.iterator();
        for(;it.hasNext();){
            System.out.println(it.next());
        }

        Collection<String> coll = new ArrayList<>();

        System.out.println("-----分割线-----");

        coll.add("hello");
        coll.add("world");
        Iterator<String> coIt = coll.iterator();
        while(coIt.hasNext()){
            System.out.println(coIt.next());
        }
//        利用for使用迭代器输出元素内容
        System.out.println("利用for使用迭代器输出元素内容");
        for(String s : coll){
            System.out.println(s);
        }
//        利用lambda表达式输出元素内容
        System.out.println("利用lambda表达式输出元素内容");
        coll.forEach(System.out::println);
    }
}
