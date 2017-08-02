package indi.cc.decoratorPattern;

/**
 * 牛奶调料，卖个1块钱
 * Author : CharlesChen
 * Time : 2017-07-26 22:21
 * Version : 1.0
 */
public class Milk extends CondimentDecorator {
    AbstractDrink abstractDrink;

    public Milk(AbstractDrink abstractDrink) {
        this.abstractDrink = abstractDrink;
    }

    @Override
    public String getDescription() {
        return abstractDrink.getDescription() + ", 牛奶";
    }

    @Override
    public float cost() {
        return abstractDrink.cost() + 1;
    }
}
