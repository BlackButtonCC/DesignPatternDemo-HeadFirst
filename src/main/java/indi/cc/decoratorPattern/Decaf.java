package indi.cc.decoratorPattern;

/**
 * 低咖啡因咖啡，卖个11块，嘿嘿。
 * Author : CharlesChen
 * Time : 2017-07-26 22:18
 * Version : 1.0
 */
public class Decaf extends AbstractDrink {
    public Decaf() {
        description = "低咖啡因咖啡";
    }

    @Override
    public float cost() {
        return 10;
    }
}
