package com.yangwang.java.yuanxing6.demo2;

/**
 * @author yangwang
 * @date 2021-09-12-9:51
 */
public class ConcretePrototype1 implements Prototype{
    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype1 c = new ConcretePrototype1();
        c.setName(this.name);
        return c;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
