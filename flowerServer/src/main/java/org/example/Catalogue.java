package org.example;

public class Catalogue {
    private Item[] items;

    public Catalogue(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
