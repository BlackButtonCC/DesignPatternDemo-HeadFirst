package indi.cc.statePattern;

/**
 * Author : CharlesChen
 * Time : 2017-12-28 10:13
 * Version : 1.0
 */
public interface State {
    public void insertQuarter();    //插入25分钱
    public void ejectQuarter();     //退钱
    public void turnCrank();        //转动摇杆
    public void dispense();     //发放糖果
}
