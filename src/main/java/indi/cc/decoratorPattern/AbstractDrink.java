package indi.cc.decoratorPattern;

/**
 * 抽象咖啡
 * Author : CharlesChen
 * Time : 2017-07-26 22:06
 * Version : 1.0
 */
abstract class AbstractDrink {
    String description = "饮品的抽象类！";

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();
}
