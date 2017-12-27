package indi.cc.iteratorAndCompositePattern.iteratorPattern;

import java.util.Iterator;

/**
 * 服务员类
 * Author : CharlesChen
 * Time : 2017-12-27 10:43
 * Version : 1.0
 */
public class Waitress {
    Menu dinerMenu, pancakeHouseMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    /**
     * 打印2个餐厅的菜单
     */
    public void printMenu() {
        Iterator iterator_diner = dinerMenu.createIterator();
        Iterator iterator_pancake = pancakeHouseMenu.createIterator();
        printMenu(iterator_diner);
        printMenu(iterator_pancake);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
    }
}
