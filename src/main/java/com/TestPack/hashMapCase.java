package com.TestPack;


import java.util.*;


public class hashMapCase {

    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<String, Integer>();
        testMap.put("a", 10);
        testMap.put("b", 20);
        testMap.put("c", 30);
        testMap.put("d", 40);

        int maxScore = Collections.max(testMap.values());
        for (Map.Entry<String, Integer> entry : testMap.entrySet()) {
            if (entry.getValue().equals(maxScore)) {
                System.out.println(entry.getKey());
                System.out.println(testMap.keySet());
                System.out.println(testMap.values());
                System.out.println(testMap.entrySet());
                System.out.println(maxScore);



            }
        }
    }
}
