package org.example;

public class Item {
    private String name;
    private String color;
    private double price;
    private String id;
    private int discount;
    private String type;


    public Item(String name, String color, double price, String id, int discount, String type) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.id = id;
        this.discount = discount;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
