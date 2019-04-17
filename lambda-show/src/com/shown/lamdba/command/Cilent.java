package com.shown.lamdba.command;

/**
 * @Package com.shown.lamdba.command
 * @Description:
 * @Author shawn
 * @Date Created in 2018-4-18
 */
public class Cilent {
    public static void main(String[] args) {
        /**
         * 有一家路边的小摊,做的小本经营,只有一个做饭的师傅,师傅饭做的还不错,
         * 可来吃饭的人们总是抱怨老板记性不好,有时候订单一多就给忘了
         * 客户取消订单，材料不足不提供
         */
        Kitchen boss = new Kitchen();
        boss.beefRice();
        boss.beefRice();
        boss.chickenRice();
        boss.eggsTomatoRice();
        boss.eggsTomatoRice();
        boss.eggsTomatoRice();
    }
}
