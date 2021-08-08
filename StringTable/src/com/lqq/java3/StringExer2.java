package com.lqq.java3;

/**
 * @Author lqq677
 * @Date 2021/8/3 10:39
 * @Description String的基本操作
 */
public class StringExer2 {
    public static void main(String[] args) {
        String s1 = new String("ab");//执行完以后，会在字符串常量池中会生成"ab"
//        String s1 = new String("a") + new String("b");////执行完以后，不会在字符串常量池中生成"ab"
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2); //false
    }
}
