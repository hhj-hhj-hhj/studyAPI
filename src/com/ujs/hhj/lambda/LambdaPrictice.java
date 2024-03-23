package com.ujs.hhj.lambda;

import java.util.Arrays;

public class LambdaPrictice {
    public static void main(String[] args) {
        String[] arr = {"abc", "ab", "abcd", "a"};
        sortOfLen(arr);
        methodTest(() -> System.out.println("lambda表达式完全省略"));
        classSort();
    }

    private static void classSort() {
//        按照年龄排序，年龄相同按照身高排序，身高相同按照名字排序
        girlFriend[] girlFriend = {new girlFriend("hhj", 14, 180), new girlFriend("hjq", 14, 175), new girlFriend("lyq", 15, 169), new girlFriend("lq", 15, 169)};
        Arrays.sort(girlFriend, (o1, o2) -> {
            if (o1.age == o2.age) {
                if(o1.height == o2.height)
                    return o1.name.compareTo(o2.name);
                else
                    return o1.height - o2.height;
            } else {
                return o1.age - o2.age;
            }
        });
//        System.out.println(Arrays.toString(girlFriend));
        for(girlFriend s : girlFriend) {
            System.out.println(s.toString());
        }
    }

    static void methodTest(LambdaInterface lambdaInterface) {
        lambdaInterface.test();
    }
    private static void sortOfLen(String[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
    }
}

@FunctionalInterface
interface LambdaInterface {
    void test();
}

class girlFriend {
    String name;
    int age;
    int height;
    girlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "girlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}