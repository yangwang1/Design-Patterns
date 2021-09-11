package com.yangwang.java.chouxianggongchang3;

/**
 * @author yangwang
 * @date 2021-09-11-7:12
 */
public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard();
    }
}
