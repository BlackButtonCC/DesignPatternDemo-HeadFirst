package indi.cc.statePattern;

/**
 * 糖果机器
 * Author : CharlesChen
 * Time : 2017-12-28 10:16
 * Version : 1.0
 */
public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        if (numberGumballs >= 0) {
            this.count = numberGumballs;
            state = noQuarterState;
        } else {
            throw new IllegalArgumentException("请输入正确的投入糖果数目");
        }

    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void eiectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("一颗糖果正在滑出！！！");
        if (count > 0) {
            count -= 1;
        }
    }

    //getters
    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }
}
