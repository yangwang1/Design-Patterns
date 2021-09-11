package com.yangwang.java.danli4;

/**
 * 饿汉式单例
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 * @author yangwang
 * @date 2021-09-11-7:44
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();
    //私有默认构造器
    private EagerSingleton(){}
    //静态工厂方法
    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
