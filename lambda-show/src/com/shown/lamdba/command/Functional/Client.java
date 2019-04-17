package com.shown.lamdba.command.Functional;

import com.shown.lamdba.command.Kitchen;

/**
 * @Package com.shown.lamdba.command.Functional
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Client {
    public static void main(String[] args) {
        //准备厨房,服务员,菜单命令工作
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        //开始营业
        System.out.println("=======================添加订单环节=======================");
        // 顾客：一份牛肉饭!
        waiter.setOrders(Kitchen::beefRice);
        // 顾客：一份鸡肉饭!
        waiter.setOrders(Kitchen::chickenRice);
        // 顾客：一份西红柿炒鸡蛋!
        waiter.setOrders(Kitchen::eggsTomatoRice);
        // 顾客：两份牛肉饭!
        waiter.setOrders(Kitchen::beefRice);
        waiter.setOrders(Kitchen::beefRice);

        System.out.println("==========服务员将订单送至厨房,厨房按照订单顺序开始做饭=========");
        //服务员通知厨房按照订单顺序开始做
        waiter.notifyKitchen(kitchen);
    }

}
