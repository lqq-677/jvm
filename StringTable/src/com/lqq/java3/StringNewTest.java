package com.lqq.java3;

/**
 *  * @Author lqq677
 *  * @Date 2021/8/3 16:22
 *  * @Description String的基本操作
 *
 *
 * 题目：
 * new String("ab")会创建几个对象？看字节码，就知道是两个。
 *     一个对象是：new关键字在堆空间创建的
 *     另一个对象是：字符串常量池中的对象"ab"。 字节码指令：ldc
 *
 *
 * 思考：
 * new String("a") + new String("b")呢？
 *  对象1：new StringBuilder()
 *  对象2： new String("a")
 *  对象3： 常量池中的"a"
 *  对象4： new String("b")
 *  对象5： 常量池中的"b"
 *
 *  深入剖析： StringBuilder的toString():
 *        char[] value = "11"
 *       对象6 ：new String(value, 0, count ) 是调用的 new String(char value[], int offset, int count)
 *       强调一下，toString()的调用，在字符串常量池中，没有生成"ab"
 *
 */
public class StringNewTest {
    public static void main(String[] args) {
        String str = new String("ab");

        //String str = new String("a") + new String("b");
    }
}
