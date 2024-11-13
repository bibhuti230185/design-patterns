package org.bibhuti.behavioural.template;

public class CoffeeMaker extends BeverageMaker {


    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Coffee Condiments");
    }
}
