package indi.cc.decoratorPattern;

/**
 * 深焙咖啡，卖个10块吧
 * Author : CharlesChen
 * Time : 2017-07-26 22:17
 * Version : 1.0
 */
public class DarkRoast extends AbstractDrink {
    public DarkRoast() {
        description = "深焙咖啡";
    }

    @Override
    public float cost() {
        return 10;
    }
}
