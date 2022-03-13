package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main11 {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>(Map.of(1,"ala",2,"ma",3,"kota",4,"jurek",5,"ma",6,"kota",7,"kota"));

        System.out.println(numberOfOccurrences(hashMap, "kota"));
    }

    public static int numberOfOccurrences(HashMap<Integer,String> hashMap,String value){
        int result = 0;
        for (Map.Entry<Integer, String> set : hashMap.entrySet()) {
            if (set.getValue().equals(value)) {
                result++;
            }
        }
        return result;
    }
}
