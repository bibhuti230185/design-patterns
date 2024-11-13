package org.bibhuti.creational.factorymethod;

public class FactoryExample {
    public static void main(String[] args) {
        KnifeStore knifeStore = new BudgetKniefStore();
        knifeStore.orderKnife("type1");
        knifeStore.orderKnife("type2");
    }
}
