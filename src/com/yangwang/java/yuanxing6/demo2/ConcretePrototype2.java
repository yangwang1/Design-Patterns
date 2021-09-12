package com.yangwang.java.yuanxing6.demo2;

/**
 * @author yangwang
 * @date 2021-09-12-9:51
 */
public class ConcretePrototype2 implements Prototype {
    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype2 c = new ConcretePrototype2();
        c.setName(this.name);
        return c;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
