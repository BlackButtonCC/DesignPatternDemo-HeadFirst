package indi.cc.statePattern;

/**
 * Author : CharlesChen
 * Time : 2017-12-28 10:22
 * Version : 1.0
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入失败，您已经投入了硬币！！！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在退钱，请检查出口！！！");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("惊喜要来咯！！！");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("请先转动摇杆！！！");
    }
}
