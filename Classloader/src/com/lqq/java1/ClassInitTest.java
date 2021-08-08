package com.lqq.java1;

/**
 * @Author lqq677
 * @Date 2021/7/28 9:31
 * @Description 构造器方法中指令按语句在源文件中出现的顺序执行
 */
public class ClassInitTest {
    private static int num = 1;

    static{
        num = 2;
        number = 20;
        //System.out.println(num);
        //System.out.println(number);//报错：非法的前向引用。
    }

    private static int number = 10;  //linking之prepare: number = 0 --> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }
}
