package com.shown.lamdba.strategy;

/**
 * @Package com.shown.lamdba.strategy
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Sub implements Strategy {

    @Override
    public int caculator(int x, int y) {
        return x - y;
    }
}
