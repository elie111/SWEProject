package org.example;

public class Employee {
    private String name;
    private String lastname;
    private String Title;
    private String id;
    private Shop shop;

    public Employee(String name, String lastname, String title, String id, Shop shop) {
        this.name = name;
        this.lastname = lastname;
        Title = title;
        this.id = id;
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
