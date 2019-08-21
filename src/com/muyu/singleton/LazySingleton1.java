package com.muyu.singleton;

/**
 * LazySingleton1
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 * 在静态方法上加上关键字synchronized
 */
public class LazySingleton1 {
    private static  LazySingleton1 singleton1;

    private LazySingleton1(){}
    public static synchronized  LazySingleton1 getSingleton1(){
        if (singleton1==null){
            singleton1 = new LazySingleton1();
        }

        return singleton1;
    }
}
