package org.bibhuti.creational.factorymethod;

public class Type2Knief extends Knife {
    @Override
    public void sharpen() {
        System.out.println("Sharpening Type2Knief");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Type2Knief");
    }

    @Override
    public void pack() {
        System.out.println("Packing Type2Knief");
    }
}
