package com.yangwang.java.chouxianggongchang3;

/**
 * 3.抽象工厂模式
 * 优点：
 * 分离接口和实现：客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体的实现是谁，客户端只是面向产品的接口编程而已。也就是说，客户端从具体的产品实现中解耦。
 * 使切换产品族变得容易：因为一个具体的工厂实现代表的是一个产品族，比如上面例子的从Intel系列到AMD系列只需要切换一下具体工厂。
 * 缺点：不太容易扩展新的产品
 *
 * @author yangwang
 * @date 2021-09-11-7:13
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new IntelFactory();
        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.makeComputer(factory);
    }
}
