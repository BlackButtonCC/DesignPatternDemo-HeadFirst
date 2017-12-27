package indi.cc.iteratorAndCompositePattern.compositePattern;

/**
 * 服务员，为菜单的主要客户。
 * Author : CharlesChen
 * Time : 2017-12-27 14:47
 * Version : 1.0
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
