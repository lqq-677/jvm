package com.lqq.java3;

/**
 * @Author lqq677
 * @Date 2021/7/31 16:17
 * @Description  同步省略说明
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized(hollis) {
            System.out.println(hollis);
        }
    }
}
