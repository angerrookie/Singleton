package com.muyu.singleton;

/**
 * Singleton2
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:静态内部类
 * 饿汉模式优化版，在类加载时，静态内部类并没有被实例化
 * 只有调用方法时
 */
public class Singleton2 {
    private  static  class SingletonHolder{
        private static final Singleton2 SINGLETON_2 = new Singleton2();
    }
    private Singleton2(){}

    public  static  final  Singleton2 getSingleton1(){
        return  SingletonHolder.SINGLETON_2;
    }
}
