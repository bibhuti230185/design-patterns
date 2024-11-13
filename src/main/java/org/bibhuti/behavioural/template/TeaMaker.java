package org.bibhuti.behavioural.template;

public class TeaMaker extends  BeverageMaker {

    @Override
    protected void addCondiments() {
        System.out.println("Adding tea Condiments");
    }

    @Override
    protected void brew() {
        System.out.println("Pouring tea in cup");
    }
}
