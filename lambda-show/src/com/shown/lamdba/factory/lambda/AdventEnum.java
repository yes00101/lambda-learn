package com.shown.lamdba.factory.lambda;

import com.shown.lamdba.factory.pojo.Adventurer;
import com.shown.lamdba.factory.pojo.FrostMage;
import com.shown.lamdba.factory.pojo.Priests;
import com.shown.lamdba.factory.pojo.Warrior;

import java.util.function.Supplier;

/**
 * @Package com.shown.lamdba.factory.lambda
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public enum AdventEnum {
    /**
     * 使用枚举变量封装这些构造器,这样不仅可以使得工厂可以将修改关闭,同时也省去了optional类的包装
     */
    WARRIOR(Warrior::new),
    MAGE_FROST(FrostMage::new),
    PRIESTS(Priests::new);

    /**
     * 枚举类,内部存一个supplier对象,存放各大职业的构造器,对外暴露getConstructor方法进行实例化
     */
    private final Supplier<Adventurer> constructor;
    AdventEnum(Supplier<Adventurer> constructor){
        this.constructor = constructor;
    }

    public Supplier<Adventurer> getConstructor() {
        return constructor;
    }
}
