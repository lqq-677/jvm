package com.lqq.java2;

/**
 * @Author lqq677
 * @Date 2021/8/3 10:25
 * @Description
 */
public class StringTest4 {
    public static void main(String[] args) {
        System.out.println();//2687
        System.out.println("1");//2688
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");//2697

        //如下的字符串"1" 到 "10"不会再次加载
        System.out.println("1");//2698
        System.out.println("2");//2698
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");//2698
    }
}

