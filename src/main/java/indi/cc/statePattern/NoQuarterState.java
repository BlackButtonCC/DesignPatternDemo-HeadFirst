package indi.cc.statePattern;

/**
 * Author : CharlesChen
 * Time : 2017-12-28 10:19
 * Version : 1.0
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("成功投入硬币！！！");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("请先投入硬币！！！");
    }

    @Override
    public void turnCrank() {
        System.out.println("请先投入硬币！！！");
    }

    @Override
    public void dispense() {
        System.out.println("请先投入硬币！！！");
    }
}
