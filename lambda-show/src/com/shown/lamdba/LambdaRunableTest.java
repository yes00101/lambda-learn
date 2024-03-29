package com.shown.lamdba;

/**
 * @Package com.shown.lamdba
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-4
 */
public class LambdaRunableTest {
    /**
     * 普通的Runnable
     */
    public static void runSomeThing() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am running");
            }
        };
        new Thread(runnable).start();
    }

    /**
     * 使用lambda后的
     */
    public static void runSomeThingByLambda() {
        new Thread(() -> System.out.println("I am running")).start();
    }

    public static void main(String[] args) {
        runSomeThing();
//      runSomeThingByLambda();
    }
}
