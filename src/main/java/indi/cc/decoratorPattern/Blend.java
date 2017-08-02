package indi.cc.decoratorPattern;

/**
 * 综合咖啡，卖个9块吧。
 * Author : CharlesChen
 * Time : 2017-07-26 22:11
 * Version : 1.0
 */
public class Blend extends AbstractDrink {
    public Blend() {
        description = "综合咖啡";
    }

    @Override
    public float cost() {
        return 9;
    }
}
