package indi.cc.statePattern;

/**
 * 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 * 在该章中，用了糖果机的状态转换来讲述这个模式。
 * Author : CharlesChen
 * Time : 2017-12-27 15:10
 * Version : 1.0
 */
public class TestCase {
    public static void main(String args[]) {
        GumballMachine gumballMachine = new GumballMachine(5);

        //gumballMachine.getState();
        //gumballMachine.insertQuarter();
        //gumballMachine.eiectQuarter();
        //gumballMachine.turnCrank();
    }

}
