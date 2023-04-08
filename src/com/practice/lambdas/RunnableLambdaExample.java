package com.practice.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        * Prior java 8
        * */

        Runnable runnable  = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda syntax
        // () -> {}

        Runnable runnableLambda = () ->{
            System.out.println("Inside runnable 2");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda2 =() -> System.out.println("insode runnable 3");
        new Thread(runnableLambda2).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable old way");
            }
        });

        new Thread(() -> System.out.println("inside runnable 4")).start();
    }
}
