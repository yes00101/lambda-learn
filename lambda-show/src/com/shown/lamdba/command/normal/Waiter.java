package com.shown.lamdba.command.normal;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Package com.shown.lamdba.command
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Waiter {
    /**
     * 用户储存订单命令的队列
     */
    private final Queue<BaseCommand> orders;

    public Waiter() {
        orders = new ArrayDeque<>();
    }

    /**
     * 增加订单与拒绝订单和添加日志,删除中间订单也很简单,数据结构换成linkedList或者arrayList即可,拒绝订单为了演示只是简单的通过类名来判断
     * @param baseCommand
     */
    public final void setOrders(BaseCommand baseCommand){
        if (baseCommand.getClass().getName().equals(EggsTomatoRiceCommand.class.getName())){
            System.out.println("西红柿炒蛋盖饭卖完了，换一个点点吧！");
        } else {
            String[] names = baseCommand.getClass().getName().split("\\.");
            System.out.printf("添加订单: %s 订单时间:  %s \n ", names[names.length -1], LocalDateTime.now());
            orders.add(baseCommand);
        }
    }

    /**
     * 通知厨房出餐
     */
    public final void notifyKitchen(){
        while (orders.peek() != null){
            orders.peek().executeCommand();
            orders.remove();
        }
    }

}
