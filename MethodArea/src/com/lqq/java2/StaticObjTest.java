package com.lqq.java2;

/**
 * staticObj、instanceObj、localObj存放在哪里？
 * 三个new的实例都放在堆空间
 * staticObj静态变量在jdk7之后随着对象的实例放在堆空间，instanceObj成员变量也是随着对象的实例放在堆空间
 * localObj局部变量则是放在foo()方法的栈帧局部变量表中
 * @Description staticObj的位置
 */
public class StaticObjTest {
    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder {
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
}
