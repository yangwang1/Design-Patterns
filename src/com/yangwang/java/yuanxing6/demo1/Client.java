package com.yangwang.java.yuanxing6.demo1;

/**
 * @author yangwang
 * @date 2021-09-12-8:46
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public Prototype operation(Prototype example){
        //需要创建原型接口的对象
        return prototype.clone();
    }
}
