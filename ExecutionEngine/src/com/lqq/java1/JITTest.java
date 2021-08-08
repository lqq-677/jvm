package com.lqq.java1;

import java.util.ArrayList;

/**
 * @Author lqq677
 * @Date 2021/8/2 21:37
 * @Description JIT
 */
public class JITTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add("让天下没有难学的技术");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
