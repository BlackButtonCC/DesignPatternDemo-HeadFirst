package indi.cc.decoratorPattern;

/**
 * 浓缩咖啡，20块，好逑贵。
 * Author : CharlesChen
 * Time : 2017-07-26 22:33
 * Version : 1.0
 */
public class Espresso extends AbstractDrink {
    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public float cost() {
        return 20;
    }
}
