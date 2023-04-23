package com.practice.functional.finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello(value ->{
            System.out.println("No last name provided "+value);
        });
        hello2("John",null,() ->{
            System.out.println("No last name provided");
        });
    }

    static void hello(Consumer<String> callback){
        System.out.println("John");
        if ("Montana" !=null){
            System.out.println("Montana");
        } else{
            callback.accept("John");
        }
    }
    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName!=null){
            System.out.println(lastName);
        } else{
            callback.run();
        }
    }
}
