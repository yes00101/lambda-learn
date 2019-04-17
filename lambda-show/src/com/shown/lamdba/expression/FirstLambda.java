package com.shown.lamdba.expression;

/**
 * @Package com.shown.lamdba.expression
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-16
 */
public class FirstLambda {

    public static void main(String[] args) {
        // Java 8之前：
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        //Java 8方式：
        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
    }
}
