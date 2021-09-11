package com.yangwang.java.jianzao5.demo2;

/**
 * @author yangwang
 * @date 2021-09-11-9:03
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildBody() {
        msg.setSubject("欢迎标题");
    }
}
