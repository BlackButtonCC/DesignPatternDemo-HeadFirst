package indi.cc.statePattern;

/**
 * Author : CharlesChen
 * Time : 2017-12-28 10:38
 * Version : 1.0
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入失败，您已经投入了硬币！！！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退钱失败，没有糖果了！！！");
    }

    @Override
    public void turnCrank() {
        System.out.println("没有糖果咯，请按退钱按钮！！！");
    }

    @Override
    public void dispense() {
        System.out.println("没有糖果咯，请按退钱按钮！！！");
    }
}
