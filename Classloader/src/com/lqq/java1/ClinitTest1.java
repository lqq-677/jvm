package com.lqq.java1;

/**
 * @Author lqq677
 * @Date 2021/7/28 11:06
 * @Description 若该类具有父类，jvm会保证子类的clinit()执行前，父类的clinit()已经执行完毕
 */
public class ClinitTest1 {
    static class Father{
        public static int A = 1;
        static{
            A = 2;
            System.out.println("父类父类的clinit()执行");
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载Father类，其次加载Son类。
        System.out.println(Son.B);//2
    }
}

