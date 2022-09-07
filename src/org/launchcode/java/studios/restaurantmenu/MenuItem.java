package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {


    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean newItem){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.isNew=newItem;

    }


}
