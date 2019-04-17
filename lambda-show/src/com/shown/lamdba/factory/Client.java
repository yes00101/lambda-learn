package com.shown.lamdba.factory;

//import com.shown.lamdba.factory.normal.AdventFactory;

import com.shown.lamdba.factory.lambda.AdventFactory;
import com.shown.lamdba.factory.pojo.Adventurer;

import static com.shown.lamdba.factory.lambda.AdventEnum.MAGE_FROST;
import static com.shown.lamdba.factory.lambda.AdventEnum.PRIESTS;
import static com.shown.lamdba.factory.lambda.AdventEnum.WARRIOR;

/**
 * @Package com.shown.lamdba.factory
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==============进入地牢==============");
        System.out.println("==========发现一群野生的哥布林==========");
        // 通过工厂实例化出三种职业 战士，冰霜法师，牧师
        Adventurer warrior = AdventFactory.createAdventurer("战士");
        Adventurer frostMage = AdventFactory.createAdventurer("冰霜法师");
        Adventurer priest = AdventFactory.createAdventurer("牧师");
        // 战斗
        System.out.println("==========触发战斗！==========");
        warrior.useBattleSkill();
        frostMage.useBattleSkill();
        priest.useBattleSkill();


        /**
         * 面向对象语言+函数式语言+枚举的结合，可以看到这种组合效果是十分棒的，代码不仅简洁易用性高同时还保持了健壮性与可扩展性
         */
        Adventurer warrior1 = AdventFactory.createAdventurer(WARRIOR);
        Adventurer frostMage1 = AdventFactory.createAdventurer(MAGE_FROST);
        Adventurer priest1 = AdventFactory.createAdventurer(PRIESTS);
    }
}
