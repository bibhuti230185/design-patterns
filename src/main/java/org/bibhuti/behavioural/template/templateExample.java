package org.bibhuti.behavioural.template;

public class templateExample {
    public static void main(String[] args) {
        System.out.println("Template Method Pattern");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}
