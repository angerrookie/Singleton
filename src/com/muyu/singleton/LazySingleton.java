package com.muyu.singleton;

/**
 * LazySingleton
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 * 线程不安全（懒汉）
 *
 * 生成唯一的实例
 * 构造函数私有
 * 向外部提供一个静态的获取对象的方法
 * 只有需要的时候才会生成对象
 */
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton(){}
    public static  LazySingleton getSingleton(){
        if (singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
