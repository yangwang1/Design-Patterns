package com.yangwang.java.jianzao5.demo2;

/**
 * @author yangwang
 * @date 2021-09-11-9:03
 */
public class Director {
    private Builder builder = null;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(String toAddress , String fromAddress){
        builder.buildSubject();
        builder.buildBody();
        builder.buildFrom(fromAddress);
        builder.buildTo(toAddress);
        builder.buildSendDate();
        builder.sendMessage();
    }

}
