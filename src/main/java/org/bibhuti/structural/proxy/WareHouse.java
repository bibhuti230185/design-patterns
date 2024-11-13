package org.bibhuti.structural.proxy;

import java.util.HashMap;
import java.util.List;

public class WareHouse implements IOrder {
    private String address;
    private HashMap<Integer, String> stock = new HashMap<>();

    @Override
    public void fulfillOrder(Order order) {
        order.getItems().forEach((item -> stock.remove(item.getNumber())));
        System.out.println("Order is fulfilled by warehouse:" + address);
    }

    public WareHouse(List<Item> items , String address) {
        this.address = address;
        for (Item item : items) {
            stock.put(item.getNumber(), item.getName());
        }
    }
    public int currentInventory(Item item) {
        if (stock.containsKey(item.getNumber()))
            return 1;
        return 0;
    }

}
