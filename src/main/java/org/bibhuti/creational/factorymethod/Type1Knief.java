package org.bibhuti.creational.factorymethod;

public class Type1Knief extends Knife {

    @Override
    public void sharpen() {
        System.out.println("Sharpening Type1Knief");
    }

    @Override
    public void polish() {
        System.out.println("Polishing Type1Knief");
    }

    @Override
    public void pack() {
        System.out.println("Packing Type1Knief");
    }


}
