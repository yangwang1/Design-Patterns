package com.yangwang.java.danli4;

/**
 * 双重检测加锁
 * 这种实现方式既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
 *提示：由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。因此一般建议，没有特别的需要，不要使用。也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
 *根据上面的分析，常见的两种单例实现方式都存在小小的缺陷，那么有没有一种方案，既能实现延迟加载，又能实现线程安全呢？
 * @author yangwang
 * @date 2021-09-11-7:55
 */
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
