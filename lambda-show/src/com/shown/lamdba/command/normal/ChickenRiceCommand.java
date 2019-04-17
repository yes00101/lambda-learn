package com.shown.lamdba.command.normal;

import com.shown.lamdba.command.Kitchen;

/**
 * @Package com.shown.lamdba.command
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class ChickenRiceCommand extends BaseCommand {
    public ChickenRiceCommand(Kitchen kitchen) {
        super(kitchen);
    }

    @Override
    public void executeCommand() {
        kitchen.chickenRice();
    }
}
