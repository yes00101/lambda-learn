package com.shown.lamdba.command.normal;

import com.shown.lamdba.command.Kitchen;

/**
 * @Package com.shown.lamdba.command.normal
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Client {
    public static void main(String[] args) {
        // 准备厨房，服务员，菜单命令工作
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        BaseCommand beefRiceCommand = new BeefRiceCommand(kitchen);
        BaseCommand chickenRiceCommand = new ChickenRiceCommand(kitchen);
        BaseCommand eggsTomatoRiceCommand = new EggsTomatoRiceCommand(kitchen);

        // 营业
        System.out.println("===========添加订单=============");
        // 顾客：牛肉饭3份
        waiter.setOrders(beefRiceCommand);
        waiter.setOrders(beefRiceCommand);
        waiter.setOrders(beefRiceCommand);
        // 顾客：西红柿鸡蛋2份
        waiter.setOrders(eggsTomatoRiceCommand);
        waiter.setOrders(eggsTomatoRiceCommand);
        // 顾客：鸡肉饭1份
        waiter.setOrders(chickenRiceCommand);
        System.out.println("=========订单送至厨房，厨房将按照顺序出餐========");
        // 通知厨房按照顺序出餐
        waiter.notifyKitchen();
    }
}
