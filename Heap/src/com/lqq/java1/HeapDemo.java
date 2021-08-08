package com.lqq.java1;

/**
 * -Xms10m -Xmx10m
 *
 * @Author lqq677
 * @Date 2021/7/30 16:06
 * @Description  堆
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }

}
