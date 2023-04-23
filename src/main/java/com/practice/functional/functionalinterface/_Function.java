package com.practice.functional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =  (numberToIncrementByOne, numberToMultiply)
            -> (numberToIncrementByOne +1)*numberToMultiply;

    public static void main(String[] args) {
        //Function takes 1 argument and produces 1 result
        int increment = increment(1 );
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        //1 input 1 output
        Function<Integer, Integer> addBy1AndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndMultiplyBy10.apply(4));

        // BiFunction takes 1 argument and produces 1 result

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));





    }

    static int increment(int number) {
        return number + 1;
    }
}
