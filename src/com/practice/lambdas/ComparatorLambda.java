package com.practice.lambdas;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        /*
         * Prior java 8
         * */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 => 01 ==02
                // 1 =>o1 > 02
                // -1 => o1<02
            }
        };
        System.out.println("Result of comparator is " + comparator.compare(3, 2));

        // using lambda

        Comparator<Integer> comparator1 = (Integer a, Integer b) -> a.compareTo(b);
        //Comparator<Integer> comparator1 = (a, b) -> a.compareTo(b);
        System.out.println("LAmbda comparator " + comparator1.compare(3, 2));

        // Natural order in comparatoor
        Comparator<Integer> naturalOrder = Comparator.naturalOrder();
        System.out.println("Natural order " + naturalOrder.compare(3, 2));
    }
}
