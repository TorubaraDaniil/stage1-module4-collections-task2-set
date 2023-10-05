package com.epam.mjc.collections.set;

import java.util.*;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newHashSet = new HashSet<>();
        Iterator<Integer> iter = sourceList.iterator();
        while(iter.hasNext()){
            int number = iter.next();
            if (number % 2 == 0){
                while (number != 0){
                    newHashSet.add(number);
                    number = number / 2;
                }
            }
            else {
                newHashSet.add(number);
                newHashSet.add(number * 2);
            }
        }
        return newHashSet;
    }
}