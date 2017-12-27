package indi.cc.iteratorAndCompositePattern.iteratorPattern;

import java.util.Iterator;

/**
 * Author : CharlesChen
 * Time : 2017-08-29 22:04
 * Version : 1.0
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 5;     //最大的菜单项的数目
    int numberOfItems = 0;
    MenuItem[] menuItems ;

    public DinerMenu() {
        menuItems = new MenuItem[4];
        this.addItem("E", "e", 7, true);
        this.addItem("F", "f", 8, false);
        this.addItem("G", "g", 9, false);
        this.addItem("H", "h", 9.5, false);
    }

    /**
     * 增加菜单项
     * @param name
     * @param description
     * @param price
     * @param isVegetarian
     */
    public void addItem(String name, String description, double price, boolean isVegetarian) {
        MenuItem tmp_menuItem = new MenuItem(name, description, price, isVegetarian);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("餐厅菜单已超过最大数量限制！");
        } else {
            this.menuItems[numberOfItems] = tmp_menuItem;
            this.numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }
}
