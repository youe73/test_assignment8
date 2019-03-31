package com.sample.model;

public class menu {
    public int id;
    public String productname;
    public String description;
    public double price;

    public menu(int id, String productname, String description, double price)
    {
        this.id = id;
        this.productname =productname;
        this.description = description;
        this.price = price;

    }

    public int getId()
    {
        return this.id;
    }

    public String getProductName()
    {
        return this.productname;
    }
    public String getDescription()
    {
        return this.description;
    }
    public double getPrice()
    {
        return this.price;
    }

    @Override
    public String toString() {
        return "menu{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
