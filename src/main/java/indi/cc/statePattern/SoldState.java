package indi.cc.statePattern;

/**
 * Author : CharlesChen
 * Time : 2017-12-28 10:35
 * Version : 1.0
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入失败，您已经投入了硬币！！！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退钱失败，糖果要出来！！！");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动摇杆不会给你带来另一颗糖果！！！");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
