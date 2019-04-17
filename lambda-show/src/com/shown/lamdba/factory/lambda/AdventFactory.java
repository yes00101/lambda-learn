package com.shown.lamdba.factory.lambda;

import com.shown.lamdba.factory.pojo.Adventurer;
import com.shown.lamdba.factory.pojo.FrostMage;
import com.shown.lamdba.factory.pojo.Priests;
import com.shown.lamdba.factory.pojo.Warrior;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * @Package com.shown.lamdba.factory.lambda
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class AdventFactory {
    /**
     * 使用supplier函数接口将构造器封装,并存储在MAP中，
     * 注意这里与传统的直接存实例好的对象进去不同，
     * 这里存储的只是构造过程，并不会真正的占用空间，
     * 除非客户端调用create方法需要这个对象了,才会实例化出来
     * 利用函数的懒加载特性
     */
    private static final Map<String, Optional<Supplier<Adventurer>>> map = new ConcurrentHashMap<>();

    static {
        /**
         * 为了防止空指针异常或者是需求并不存在的类,在supplier的基础上使用了optional类进行包装,避免了各类if判断
         */
        map.put("战士", Optional.of(Warrior::new));
        map.put("冰霜法师", Optional.of(FrostMage::new));
        map.put("牧师", Optional.of(Priests::new));
    }

    public static Adventurer createAdventurer(String professionType) {
        //get(professionType)获得optional对象,orElseThrow用于防止或者异常参数,get()及早求值,执行对象的实例化,直到这一步函数才真正的执行
        return map.get(professionType)
                .orElseThrow(() -> new IllegalArgumentException("我们工厂没这种职业!"))
                .get();
    }

    /**
     * 使用枚举改良之后就剩下了这么多代码
     *
     * @param adventEnum
     * @return
     */
    public static Adventurer createAdventurer(AdventEnum adventEnum) {
        return adventEnum.getConstructor().get();
    }


}
