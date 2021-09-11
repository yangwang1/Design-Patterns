package com.yangwang.java.jianzao5.demo2;

/**
 * @author yangwang
 * @date 2021-09-11-9:03
 */
public class GoodbyeBuilder extends Builder {
    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }
    @Override
    public void buildSubject() {
        msg.setBody("欢送内容");
    }

    @Override
    public void buildBody() {
        msg.setSubject("欢送标题");
    }
}
