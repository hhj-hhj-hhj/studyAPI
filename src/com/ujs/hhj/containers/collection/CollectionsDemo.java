package com.ujs.hhj.containers.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
//        列出Collections类的常用方法
//        void reverse(List<?> list)：反转指定列表中元素的顺序。
//        void shuffle(List<?> list)：使用默认随机源对指定列表进行置换。
//        void sort(List<T> list)：根据元素的自然顺序对指定列表按升序进行排序。
//        void sort(List<T> list, Comparator<? super T> c)：根据指定比较器产生的顺序对指定列表进行排序。
//        void swap(List<?> list, int i, int j)：将指定列表中的两个索引进行交换。
//        void fill(List<? super T> list, T obj)：用指定元素替换指定列表中的所有元素。
//        int frequency(Collection<?> c, Object o)：返回指定集合中指定元素的出现次数。
//        int indexOfSubList(List<?> source, List<?> target)：返回指定源列表中第一次出现指定目标列表的起始位置；如果没有这样的元素，则返回-1。
//        int lastIndexOfSubList(List<?> source, List<?> target)：返回指定源列表中最后一次出现指定目标列表的起始位置；如果没有这样的元素，则返回-1。
//        boolean addAll(Collection<? super T> c, T... elements)：将指定元素添加到指定集合中。
//        boolean replaceAll(List<T> list, T oldVal, T newVal)：使用新值替换指定列表中的所有旧值。
//        void copy(List<? super T> dest, List<? extends T> src)：将所有元素从一个列表复制到另一个列表。


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
