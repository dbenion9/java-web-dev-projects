package org.launchcode;


import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category; // e.g., appetizer, main course, dessert
    private boolean isNew; // indicates if the menu item is new


    // Constructor
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price + "\nDescription: " + description +
                (isNew ? " - NEW!" : "");
    }

    // equals and hashCode methods for comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}

