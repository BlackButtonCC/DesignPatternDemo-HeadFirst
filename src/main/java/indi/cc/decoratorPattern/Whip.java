package indi.cc.decoratorPattern;

/**
 * 奶泡，1块钱
 * Author : CharlesChen
 * Time : 2017-07-26 22:32
 * Version : 1.0
 */
public class Whip extends CondimentDecorator {
    AbstractDrink abstractDrink;

    public Whip(AbstractDrink abstractDrink) {
        this.abstractDrink = abstractDrink;
    }

    @Override
    public String getDescription() {
        return abstractDrink.getDescription() + ", 奶泡";
    }

    @Override
    public float cost() {
        return abstractDrink.cost() + 1;
    }
}
