package org.bibhuti.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyExample {
    public static void main(String[] args) {
        WareHouse wareHouse =createWareHouse("WareHouse1");
        WareHouse wareHouse1 =createWareHouse1("WareHouse2");

        Order order = new Order();

        order.getItems().add(new Item("item1", 100));
        order.getItems().add(new Item("item22", 200));
        order.getItems().add(new Item("item3", 300));

        WareHouseProxy wareHouseProxy = new WareHouseProxy(Arrays.asList(wareHouse, wareHouse1));
        wareHouseProxy.fulfillOrder(order);
    }

    private static WareHouse createWareHouse(String wareHouse1) {
        List<Item> items =new ArrayList<>();
        items.add(new Item("item1", 100));
        items.add(new Item("item2", 200));
        items.add(new Item("item3", 300));

        return  new WareHouse(items, wareHouse1);
    }

    private static WareHouse createWareHouse1(String wareHouse1) {
        List<Item> items =new ArrayList<>();
        items.add(new Item("item11", 100));
        items.add(new Item("item22", 200));
        items.add(new Item("item33", 300));

       return new WareHouse(items, wareHouse1);
    }
}
