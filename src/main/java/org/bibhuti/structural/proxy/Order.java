package org.bibhuti.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private List<Item> items = new ArrayList<>();


    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
