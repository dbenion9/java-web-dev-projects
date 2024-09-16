package org.launchcode;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    // Constructor
    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date(); // set the current date when the menu is created
    }

    // Method to add a menu item
    public void addItem(MenuItem item) {
        if (!menuItems.contains(item)) {
            menuItems.add(item);
            updateLastUpdated(); // update the menu's last updated date
        }
    }

    // Method to remove a menu item
    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        updateLastUpdated(); // update the menu's last updated date
    }

    // Method to update the lastUpdated field
    private void updateLastUpdated() {
        this.lastUpdated = new Date();
    }

    // Getter for lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // Method to display the entire menu
    public void displayMenu() {
        for (MenuItem item : menuItems) {
            System.out.println(item.toString());
        }
        System.out.println("Menu last updated: " + lastUpdated);
    }

    // Method to display items by category
    public void displayByCategory(String category) {
        for (MenuItem item : menuItems) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println(item.toString());
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        return "\n SAUCY PORKA APPETIZERS" + appetizers;
    }
}

