package com.company;

import java.util.*;

public class Main10 {

    public static void main(String[] args) {
        Integer[] array = new Integer[] {1,2,2,4,5,6,6,8,9,6};

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));

        System.out.println(hashSet);
    }
}
