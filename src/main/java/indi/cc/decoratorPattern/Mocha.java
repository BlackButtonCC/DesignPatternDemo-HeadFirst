package indi.cc.decoratorPattern;

/**
 * 摩卡调料，2块钱。
 * Author : CharlesChen
 * Time : 2017-07-26 22:30
 * Version : 1.0
 */
public class Mocha extends CondimentDecorator {
    AbstractDrink abstractDrink;

    public Mocha(AbstractDrink abstractDrink) {
        this.abstractDrink = abstractDrink;
    }

    @Override
    public String getDescription() {
        return abstractDrink.getDescription() + ", 摩卡";
    }

    @Override
    public float cost() {
        return abstractDrink.cost() + 2;
    }
}
