package com.muyu.singleton;

/**
 * Singleton1
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:双重校验锁
 * 懒汉模式的优化版，拥有线程安全、高效率以及延迟加载等特性。但是这种方式需要jdk1.5以上，且在一些平台和编译器下有错
 */
public class Singleton1 {

    private  static  volatile Singleton1 singleton1;

    private Singleton1(){}

    public static Singleton1 getSingleton1(){
        if (singleton1==null){
            synchronized (Singleton1.class){
                if (singleton1==null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
