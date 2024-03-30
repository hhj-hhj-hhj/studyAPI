package com.ujs.hhj.containers.map;

import java.util.Map;
import java.util.TreeMap;

public class practice {
    public static void main(String[] args) {
        String s = "aasdasfasfasfggkwekgoidxzjhvngkgxzv";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        map.forEach(MyFunction::printChar);
    }
}

class MyFunction{
    public static void printChar(Character c, Integer i){
        System.out.print(c +"(" + i + ")");
    }
}