package com.shown.lamdba;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package com.shown.lamdba
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-4
 */
public class MethodReferenceTest {
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
