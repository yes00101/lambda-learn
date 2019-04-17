package com.shown.lamdba;

/**
 * @Package com.shown.lamdba
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-4
 */
public class LambdaReferenceMethodTest02 {
    public static void main(String[] args) {
        /**
         * 表达式具体写法： ObjectRef::methodName
         */
        Converter<String, Integer> converter = from -> new Helper().String2Int(from);
        Integer convert = converter.convert("120");
        System.out.println(convert);
    }



    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    static class Helper {
        public int String2Int(String from) {
            return Integer.valueOf(from);
        }
    }
}
