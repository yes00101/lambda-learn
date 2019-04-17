package com.shown.lamdba.strategy;

/**
 * @Package com.shown.lamdba.strategy
 * @Description: 客户端，根据不同的需求实例化不同的Context，使用统一方法获得结果
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Client {
    /**
     * 策略模式将这些加减乘除不同的算法使用策略子类进行包裹,客户端根据需求实例化Context类,然后通过Context类的getResult方法实现接口的调用,
     * 注意这里与简单工厂模式的区别,简单工厂模式通过Factory实例化出不同的类,然后调用实例类的getResult()的方法获得结果,而策略模式是通过调用Context的getResult方法获得结果,
     * 所以简单工厂模式的客户端需要与工厂类以及实例化类相关联,策略模式的客户端只与Context类相关联,可以说耦合度进一步降低了
     * @param args
     */
    public static void main(String[] args) {
        Context context;
        int x = 10;
        int y = 2;
        String strategy = "add";

        switch (strategy) {
            case "add":
                context = new Context(new Add());
                break;
            case "sub":
                context = new Context(new Sub());
                break;
            default:
                context = new Context(new Mul());
                break;
        }
        System.out.println(context.getResult(x, y));

    }
}
