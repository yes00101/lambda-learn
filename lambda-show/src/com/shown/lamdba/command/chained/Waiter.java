package com.shown.lamdba.command.chained;

import com.shown.lamdba.command.Kitchen;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * @Package com.shown.lamdba.command.Functional
 * @Description: 链式调用
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Waiter {
    /**
     * 队列装载的不再是命令对象了,而是更直接的厨房类的行为
     */
    private final Queue<Consumer<Kitchen>> orders;

    public Waiter() {
        orders = new ArrayDeque<>();
    }

    /**
     * 添加订单 通过修改返回值的方式 可以实现链式调用
     * @param kitchenAction 厨房的具体行为
     */
    public final Waiter setOrders(Consumer<Kitchen> kitchenAction) {
        System.out.printf("添加订单成功! 订单时间: %s \n", LocalDateTime.now());
        orders.add(kitchenAction);
        return this;
    }

    /**
     * 这里增加一个执行者参数,来对队列中的行为进行操作
     * @param kitchen 执行者,用于执行队列中的行为
     */
    public final void notifyKitchen(Kitchen kitchen) {
        while (orders.peek() != null) {
            orders.peek().accept(kitchen);
            orders.remove();
        }
    }
}
