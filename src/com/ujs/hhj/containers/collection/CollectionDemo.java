package com.ujs.hhj.containers.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
//        public boolean add (E e) //添加元素
//        public boolean remove (Object o) //删除元素
//        public boolean contains (Object o) //判断是否包含某个元素
//        public boolean isEmpty () //判断是否为空
//        public int size () //获取元素个数
//        public void clear () //清空集合
//        public Object[] toArray () //将集合转换为数组

//        注意点：Collection是一个接口，不能直接使用，需要使用它的实现类
//        Collection是一个单列集合，它是List、Set、Queue的父接口

//        利用多态创建集合对象
        Collection<String> coll = new ArrayList<>();

        coll.add("hello");
        coll.add("world");
        System.out.println(Arrays.toString(coll.toArray()));

//        删除元素
//        注意，只能根据元素删除，而不能根据索引删除
        coll.remove("hello");
        boolean flag = coll.remove("aaa");
        System.out.println(flag);
        System.out.println(Arrays.toString(coll.toArray()));

//        判断是否包含某个元素
        System.out.println(coll.contains("world"));
        System.out.println(coll.contains("aaa"));

    }
}
