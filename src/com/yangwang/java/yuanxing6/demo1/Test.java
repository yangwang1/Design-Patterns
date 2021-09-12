package com.yangwang.java.yuanxing6.demo1;

/**
 * @author yangwang
 * @date 2021-09-12-9:30
 */
public class Test {
    public static void main(String[] args) {
        ConcretePrototype1 c = new ConcretePrototype1();
        Client client = new Client(c);
        Prototype prototype = client.operation(c);
        System.out.println(c);
        System.out.println(prototype);
    }
}
