package indi.cc.iteratorAndCompositePattern.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 早餐饼屋的菜单，其菜单项是ArrayList类型，所以直接返回ArrayList已经实现的迭代器即可。
 * Author : CharlesChen
 * Time : 2017-08-29 21:52
 * Version : 1.0
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.addItem("A", "a", 10, true);
        this.addItem("B", "b", 11, false);
        this.addItem("C", "c", 12, true);
        this.addItem("D", "d", 13, false);
    }

    /**
     * 增加菜单项
     * @param name
     * @param description
     * @param price
     * @param isVegetarian
     */
    public void addItem(String name, String description, double price, boolean isVegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, isVegetarian);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
