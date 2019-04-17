package com.shown.lamdba.command.normal;

import com.shown.lamdba.command.Kitchen;

/**
 * @Package com.shown.lamdba.command
 * @Description: 基础抽象命令，自类继承该类对抽象方法进行实现
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public abstract class BaseCommand {
    protected Kitchen kitchen;

    public BaseCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public abstract void executeCommand();
}
