package com.muyu.singleton;

/**
 * HungerSingleton
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:类加载的时候就生成一个对象
 */
public class HungerSingleton {
    private  static  HungerSingleton singleton = new HungerSingleton();

    private HungerSingleton(){}

    public static HungerSingleton getSingleton(){
        return singleton;
    }
}
