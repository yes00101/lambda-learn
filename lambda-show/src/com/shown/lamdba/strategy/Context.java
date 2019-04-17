package com.shown.lamdba.strategy;

/**
 * @Package com.shown.lamdba.strategy
 * @Description: 上下文，用于客户端与算法接口交互
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int x, int y){
        return strategy.caculator(x, y);
    }
}
