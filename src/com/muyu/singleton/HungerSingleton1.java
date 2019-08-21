package com.muyu.singleton;

/**
 * HungerSingleton
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:类加载的时候就生成一个对象
 */
public class HungerSingleton1 {
    private static HungerSingleton1 singleton1 = null;

    static {
        singleton1 = new HungerSingleton1();
    }

    private HungerSingleton1(){}

    public static HungerSingleton1 getSingleton() {

        return singleton1;
    }
}
