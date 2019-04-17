package com.shown.lamdba.command.chained.more;

import java.util.function.Consumer;

/**
 * @Package com.shown.lamdba.command.chained.more
 * @Description: lambda的方法引用固然使得代码清晰可见，但是坏处是一旦使用了方法引用，
 * 就无法进行lambda的链式调用，也就是无法使用andThen这样的链式方法，但是我们通过一个中转站，
 * 先将方法引用转换成函数接口，再链式调用，因为方法引用本质上是lambda的语法糖，下面是转换方法，十分简易。
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class FunctionCastUtil {
    public static <T>Consumer<T> asComsumer(Consumer<T> consumer){
        return consumer;
    }
}
