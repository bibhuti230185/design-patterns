package org.bibhuti.structural.proxy;

import java.util.List;

public class WareHouseProxy implements IOrder {
    private List<WareHouse> wareHouseList;

    public WareHouseProxy(List<WareHouse> wareHouseList) {
        this.wareHouseList = wareHouseList;
    }
    @Override
    public void fulfillOrder(Order order) {
        order.getItems().forEach(item -> wareHouseList.forEach(wareHouse -> {
            if (wareHouse.currentInventory(item) > 0) {
                wareHouse.fulfillOrder(order);
            }
        }));
        System.out.println("Order is fulfilled");
    }

}