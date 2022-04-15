package org.example;

public class Chain {
    private Shop[] shops;

    public Chain(Shop[] shops) {
        this.shops = shops;
    }

    public Shop[] getShops() {
        return shops;
    }

    public void setShops(Shop[] shops) {
        this.shops = shops;
    }
}
