package com.yangwang.java.yuanxing6.demo2;

/**
 * @author yangwang
 * @date 2021-09-12-10:09
 */
public class Client {

    public static void main(String[] args) {
            Prototype p1 = new ConcretePrototype1();
            p1.setName("p1");
            PrototypeManager.setPrototype("p1", p1);
            //获取原型来创建对象
            Prototype p2 = PrototypeManager.getPrototype("p1").clone();
            p2.setName("p2");
            System.out.println("p1:" + p1);
            System.out.println("p2:" + p2);
            //有人动态的切换了实现
            Prototype p3 = new ConcretePrototype2();
            p3.setName("p3");
            PrototypeManager.setPrototype("p1", p3);
            System.out.println("p3:" + p3);
            //重新获取原型来创建对象
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("p4");
            System.out.println("p4:" + p4);
            //有人注销了这个原型
            PrototypeManager.removePrototype("p1");
            //再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("p1");
            System.out.println("p5:" + p5);
    }

}
