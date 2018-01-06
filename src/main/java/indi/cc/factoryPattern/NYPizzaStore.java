package indi.cc.factoryPattern;

/**
 * 纽约披萨店
 * Author : CharlesChen
 * Time : 2018-01-06 19:44
 * Version : 1.0
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "芝士":
                return new NYStyleCheesePizza();
            default:
                return null;
        }
    }
}
