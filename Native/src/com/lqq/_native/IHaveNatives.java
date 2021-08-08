package com.lqq._native;

/**
 * @Author lqq677
 * @Date 2021/7/28 21:47
 * @Description native
 */
public class IHaveNatives {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;

}
