package indi.cc.iteratorAndCompositePattern.compositePattern;

/**
 * Author : CharlesChen
 * Time : 2017-12-27 14:50
 * Version : 1.0
 */
public class MenuTest {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new Menu("煎饼屋菜单", "早餐");
        MenuComponent dinerMenu = new Menu("路边小饭馆菜单", "午饭");
        MenuComponent cafeMenu = new Menu("咖啡屋菜单", "晚饭");
        MenuComponent dessertMenu = new Menu("甜点菜单", "甜点项目");

        MenuComponent allMenus = new Menu("所有菜单", "所有菜单都被结合");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //加入菜单项
        dinerMenu.add(new MenuItem("披萨", "意大利面和大蒜酱，一片面包", true, 3.89));
        dinerMenu.add(dessertMenu);
        dinerMenu.add(new MenuItem("苹果派", "有古怪的外壳，配上香草冰淇淋", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
