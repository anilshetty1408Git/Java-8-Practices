package com.practice.imperativedeclarative;

import java.util.stream.IntStream;

/*
 * Find sum of 0 to 100
 * */public class ImperativeVsDeclarative {

    public static void main(String[] args) {
        /*Imperative style*/
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Imperative style " + sum);

        /*Declarative style*/
        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Declarative style " + sum1);


    }


}
