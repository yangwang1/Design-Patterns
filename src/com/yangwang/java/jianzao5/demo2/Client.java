package com.yangwang.java.jianzao5.demo2;

/**
 * 建造模式
 * @author yangwang
 * @date 2021-09-11-9:04
 */
public class Client {
    public static void main(String[] args) {
        WelcomeBuilder welcomeBuilder = new WelcomeBuilder();
        Director director = new Director(welcomeBuilder);
        director.construct("toAddress@126.com", "fromAddress@126.com");
    }
}
