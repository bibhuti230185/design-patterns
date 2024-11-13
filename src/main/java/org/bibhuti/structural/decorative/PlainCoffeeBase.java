package org.bibhuti.structural.decorative;

public class PlainCoffeeBase implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
