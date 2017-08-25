package indi.cc.adaptorAndFacadePattern;

/**
 * Author : CharlesChen
 * Time : 2017-08-25 19:50
 * Version : 1.0
 */
public class TurkeyAdaptor implements Duck{
    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        System.out.println("我是Turkey:" + this.turkey.getName() + ",咕咕叫!");
    }

    @Override
    public void fly() {
        System.out.println("我是Turkey:" + this.turkey.getName() + ",攒劲儿飞!");
    }
}
