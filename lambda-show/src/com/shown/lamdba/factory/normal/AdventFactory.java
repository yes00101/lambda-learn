package com.shown.lamdba.factory.normal;

import com.shown.lamdba.factory.pojo.Adventurer;
import com.shown.lamdba.factory.pojo.FrostMage;
import com.shown.lamdba.factory.pojo.Priests;
import com.shown.lamdba.factory.pojo.Warrior;

/**
 * @Package com.shown.lamdba.factory
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class AdventFactory {
    public static Adventurer createAdventurer(String professionType){
        Adventurer adventurer;
        switch (professionType){
            case "战士":
                adventurer = new Warrior();
                break;
            case "冰霜法师":
                adventurer = new FrostMage();
                break;
            case "牧师":
                adventurer = new Priests();
                break;
            default:
                throw new IllegalArgumentException("您选择的职业不存在！");
        }
        return adventurer;
    }
}
