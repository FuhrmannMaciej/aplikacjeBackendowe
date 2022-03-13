package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main9 {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));

        Iterator<Integer> iterator = arrayList.iterator();
        iterate(iterator);
        System.out.println(arrayList);

        iterator = linkedList.iterator();
        iterate(iterator);
        System.out.println(linkedList);
    }

    public static void iterate(Iterator<Integer> iterator){
        int i = 1;
        while(iterator.hasNext()) {
            iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
            i++;
        }
    }
}
