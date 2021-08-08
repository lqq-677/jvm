package com.lqq.java1;

import org.testng.annotations.Test;

/**
 * @Author lqq677
 * @Date 2021/8/3 09:20
 * @Description String的基本使用:体现String的不可变性
 */
public class StringTest1 {
    @Test
    public void test1() {
        String s1 = "abc";//字面量定义的方式，"abc"存储在字符串常量池中
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);//false

        System.out.println(s1);//hello
        System.out.println(s2);//abc

    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        s2 += "def";
        System.out.println(s2);//abcdef
        System.out.println(s1);//abc
    }

    @Test
    public void test3() {
        String s1 = "abc";
        String s2 = s1.replace('a', 'm');//return new String(XXX);
        System.out.println(s1);//abc
        System.out.println(s2);//mbc
    }
}
