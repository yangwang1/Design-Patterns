package com.yangwang.java.chouxianggongchang3;

/**
 * @author yangwang
 * @date 2021-09-11-7:12
 */
public class ComputerEngineer {

    public void makeComputer(AbstractFactory abstractFactory){
        prepareHardwares(abstractFactory);
    }

    private void prepareHardwares(AbstractFactory abstractFactory){
        Cpu cpu = abstractFactory.createCpu();
        Mainboard mainboard = abstractFactory.createMainboard();
        cpu.calculate();
        mainboard.installCPU();
    }
}
