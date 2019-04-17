package com.shown.lamdba.command;

/**
 * @Package com.shown.lamdba.command
 * @Description: 命令模式把一个请求或者操作封装到一个对象中。
 * 命令模式允许系统使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Kitchen {
    public void beefRice(){
        System.out.println("一份牛肉饭盖饭做好了!");
    }

    public void eggsTomatoRice(){
        System.out.println("一份西红柿鸡蛋饭做好了!");
    }

    public void chickenRice(){
        System.out.println("一份红烧鸡肉盖饭做完啦!");
    }
}
