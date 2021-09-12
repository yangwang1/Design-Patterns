package com.yangwang.java.yuanxing6.demo2;

/**
 * @author yangwang
 * @date 2021-09-12-9:44
 */
public interface Prototype {
    public Prototype clone();
    public void setName(String name);
    public String getName();
}
