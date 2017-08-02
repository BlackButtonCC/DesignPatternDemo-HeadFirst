package indi.cc.decoratorPattern;

/**
 * Author : CharlesChen
 * Time : 2017-07-26 22:31
 * Version : 1.0
 */
public class Soy extends CondimentDecorator {
    AbstractDrink abstractDrink;

    public Soy(AbstractDrink abstractDrink) {
        this.abstractDrink = abstractDrink;
    }

    @Override
    public String getDescription() {
        return abstractDrink.getDescription() + ", 豆浆";
    }

    @Override
    public float cost() {
        return abstractDrink.cost() + 1.5f;
    }
}
