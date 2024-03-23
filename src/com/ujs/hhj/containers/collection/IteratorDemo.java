package com.ujs.hhj.containers.collection;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "java");
        Iterator<String> it = list.iterator();
        for(;it.hasNext();){
            System.out.println(it.next());
        }
    }
}
