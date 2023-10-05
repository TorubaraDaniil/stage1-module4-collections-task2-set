package com.epam.mjc.collections.set;

import javax.swing.tree.TreeModel;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();
            int square = (int) Math.pow(number, 2);
            if (square >= lowerBound && square <= upperBound){
                newTreeSet.add(square);
            }
        }
        return newTreeSet;
    }
}
