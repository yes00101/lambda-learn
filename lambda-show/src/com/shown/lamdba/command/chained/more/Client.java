package com.shown.lamdba.command.chained.more;

import com.shown.lamdba.command.Kitchen;
import com.shown.lamdba.command.chained.Waiter;

import static com.shown.lamdba.command.chained.more.FunctionCastUtil.asComsumer;

/**
 * @Package com.shown.lamdba.command.Functional
 * @Description: 区别在于，链式的setOrders的 日志信息是会输出5条的(进行了5次的setOrders动作)，
 * 而这里只会输出一条，原因是这里的一条动作里andThen了4个动作，这一条动作链作为一个整体传入了Setorders
 * 例如通知厨房做一道便当快餐，而便当快餐假设是由一份牛肉饭+一份鸡肉饭构成的，那么在这里这一个订单就可以使用这样的andThen来进行构造，
 * 这样的链式组合其实是有序的，其实这就是建造者模式的lambda表示形式。
 * 使用这样的方法，你的设计里就是包含了命令模式+建造者模式，以lambda形式表现出来，当然如果不按照顺序的话，这样的模式你还可以理解成组合的形式。
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Client {
    public static void main(String[] args) {
        //准备厨房,服务员,菜单命令工作
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        //开始营业
        // 顾客：一份牛肉饭!
        // 顾客：一份鸡肉饭!
        // 顾客：一份西红柿炒鸡蛋!
        // 顾客：两份牛肉饭!
        System.out.println("=====================添加订单环节=======================");
        // 通过链式调用完成
        waiter.setOrders(asComsumer(Kitchen::beefRice)
                .andThen(Kitchen::chickenRice)
                .andThen(Kitchen::eggsTomatoRice)
                .andThen(Kitchen::beefRice)
                .andThen(Kitchen::beefRice));

        System.out.println("==========服务员将订单送至厨房,厨房按照订单顺序开始做饭=========");
        //服务员通知厨房按照订单顺序开始做
        waiter.notifyKitchen(kitchen);
    }

}
