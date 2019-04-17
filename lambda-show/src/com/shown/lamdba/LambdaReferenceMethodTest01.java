package com.shown.lamdba;

/**
 * @Package com.shown.lamdba
 * @Description: 通过接口将string转换为int
 * @Author shawn
 * @Date Created in 2018-4-4
 */
public class LambdaReferenceMethodTest01 {
    public static void main(String[] args) {

        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return new Helper().String2Int(from);
            }
        };
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
