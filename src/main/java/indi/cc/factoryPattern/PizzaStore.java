package indi.cc.factoryPattern;

import java.util.ArrayList;

/**
 * 高层抽象披萨店
 * Author : CharlesChen
 * Time : 2018-01-06 19:21
 * Version : 1.0
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
