package com.TestPack;
import java.util.*;

import java.util.HashMap;
import java.util.Scanner;

public class SoloLearn_PrimitiveOperators {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//          int ageLimit = scanner.nextInt();


        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);


//
//        Integer[] nameArr = new Integer[7];
//        nameArr = ages.values().toArray(nameArr);
//
//        for (Integer i:nameArr){
//        System.out.println(i);}


        System.out.println("ages.keySet: "+ ages.keySet());
        System.out.println("ages.values: "+ ages.values());
        System.out.println("ages.containsValue "+ ages.containsValue(24));
        System.out.println("ages.containsKey "+ ages.containsKey("Tom"));
        System.out.println("ages.get(\"Tom\"): "+ ages.get("Tom"));
        System.out.println(ages);

    }
}