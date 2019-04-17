package com.shown.lamdba.command.Functional;

import com.shown.lamdba.command.Kitchen;
import com.shown.lamdba.command.normal.BaseCommand;
import com.shown.lamdba.command.normal.ChickenRiceCommand;
import com.shown.lamdba.command.normal.EggsTomatoRiceCommand;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * @Package com.shown.lamdba.command.Functional
 * @Description: 客户端代码,简单、清晰的惊人,代码自带注释效果,无论是简短性还是可阅读性,都比之前的要好上很多,中间的营业代码很直观
 * 已经没有其他类的代码了!类的数量由原先的7个变成了3个
 * 并且由于服务员类(Invoke角色)依然存在,原先的解耦复合控制扩展等优点,一个都没少，与此同时客户端的代码也清爽了不少。
 * 试想一下,假如现在厨房有100道做菜的方法,按照原先的方法实现的类的数量应该是3(客户端+厨房+服务员) + 1(抽象命令接口) + 100(具体命令接口) = 104个类,而采用lambda之后,依旧只需要三个类！并且原先的优点完全保留了下来。
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
     * 添加订单
     * @param kitchenAction 厨房的具体行为
     */
    public final void setOrders(Consumer<Kitchen> kitchenAction) {
        System.out.printf("添加订单成功! 订单时间: %s \n", LocalDateTime.now());
        orders.add(kitchenAction);
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
