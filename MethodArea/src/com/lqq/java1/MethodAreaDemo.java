package com.lqq.java1;

/**
 *  jdk7及以前：
 *  -XX:PermSize=100m -XX:MaxPermSize=100m
 *
 *  jdk8及以后：
 *  -XX:MetaspaceSize=100m  -XX:MaxMetaspaceSize=100m
 * @Author lqq677
 * @Date 2021/7/31 21:37
 * @Description 测试设置方法区大小参数的默认值
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("end...");
    }
}
