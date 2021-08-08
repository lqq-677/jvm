package com.lqq.java2;

/**
 * @Author lqq677
 * @Date 2021/7/28 12:19
 * @Description 类加载器
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层：扩展类加载器
        ClassLoader extClassLoad = systemClassLoader.getParent();
        System.out.println(extClassLoad); // sun.misc.Launcher$ExtClassLoader@1540e19d

        //获取其上层：引导类加载器（获取不到）
        ClassLoader bootstrapClassLoad = extClassLoad.getParent();
        System.out.println(bootstrapClassLoad); // null

        //对于用户自定义类来说：默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类使用引导类加载器进行加载的。---> Java的核心类库都是使用引导类加载器进行加载的。
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null


    }

}
