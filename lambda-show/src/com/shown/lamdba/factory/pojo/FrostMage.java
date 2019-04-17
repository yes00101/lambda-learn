package com.shown.lamdba.factory.pojo;

/**
 * @Package com.shown.lamdba.factory
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class FrostMage implements Adventurer{
    @Override
    public void useBattleSkill() {
        System.out.println("冰封！");
    }
}
