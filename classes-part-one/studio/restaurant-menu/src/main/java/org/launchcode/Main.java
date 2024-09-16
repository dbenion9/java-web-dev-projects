package org.launchcode;

import org.launchcode.Menu;
import org.launchcode.MenuItem;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem("Pasta Carbonara", 12.50, "Classic Italian pasta.", "Main Course",true);
        MenuItem item2 = new MenuItem("Chocolate Cake", 6.00, "Rich chocolate layered cake.", "Dessert",true);

        menu.addItem(item1);
        menu.addItem(item2);

        System.out.println(item1);
        System.out.println(menu);
        System.out.println(menu.getLastUpdated());// write your code here
    }
}
