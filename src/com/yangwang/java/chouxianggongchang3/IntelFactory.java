package com.yangwang.java.chouxianggongchang3;

/**
 * @author yangwang
 * @date 2021-09-11-7:12
 */
public class IntelFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard();
    }
}
