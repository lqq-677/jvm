package com.lqq.java2;

/**
 * @Author lqq677
 * @Date 2021/7/29 10:33
 * @Description 动态链接（指向运行时常量池的方法引用）
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA(){
        System.out.println("methodA()....");
    }

    public void methodB(){
        System.out.println("methodB()....");

        methodA();

        num++;
    }

}
