package com.shown.lamdba.command.normal;

import com.shown.lamdba.command.Kitchen;

/**
 * @Package com.shown.lamdba.command
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class EggsTomatoRiceCommand extends BaseCommand {

    public EggsTomatoRiceCommand(Kitchen kitchen) {
        super(kitchen);
    }

    @Override
    public void executeCommand() {
        kitchen.eggsTomatoRice();
    }
}
