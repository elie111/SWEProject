package org.example;

import java.util.Date;

public class Order {
    private Date date;
    private Item[] itemsarr;
    private boolean confirm;

    public Order(Date date, Item[] itemsarr, boolean confirm) {
        this.date = date;
        this.itemsarr = itemsarr;
        this.confirm = confirm;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Item[] getItemsarr() {
        return itemsarr;
    }

    public void setItemsarr(Item[] itemsarr) {
        this.itemsarr = itemsarr;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }
}
