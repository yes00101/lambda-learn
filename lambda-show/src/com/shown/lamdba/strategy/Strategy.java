package com.shown.lamdba.strategy;

/**
 * @Package com.shown.lamdba.strategy
 * @Description: 策略模式定义了算法家族,分别封装起来,让他们之间可以互相替换,此模式让算法的变化,不会影响到使用算法的客户
 * 只要是某个地方需要根据不同的情况执行不同的策略,就可以尝试使用策略模式,无需管内部究竟是算法还是什么业务,这样做的好处就是在于可以消除掉条件判断语句,将行为独立出来进行测试修改
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public interface Strategy {
    /**
     * 计算接口
     * @param x
     * @param y
     * @return
     */
    int caculator(int x, int y);
}
