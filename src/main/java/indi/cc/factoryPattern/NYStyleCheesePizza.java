package indi.cc.factoryPattern;

/**
 * 纽约风格芝士披萨
 * Author : CharlesChen
 * Time : 2018-01-06 19:37
 * Version : 1.0
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "纽约风格披萨";
        dough = "薄脆饼";
        sauce = "大蒜番茄酱";

        toppings.add("意大利高级奶酪");
    }
}
