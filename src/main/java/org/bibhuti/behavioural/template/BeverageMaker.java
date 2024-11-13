package org.bibhuti.behavioural.template;

// Abstract class defining the template method
public abstract class BeverageMaker {
    // Template method defining the overall process, this method is final so that subclasses cannot override it
    // This method calls the abstract methods brew() and addCondiments() which are implemented by subclasses
    // The sequence of steps is fixed and cannot be changed by subclasses
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Abstract methods to be implemented by subclasses
    abstract void brew();
    abstract void addCondiments();

    // Common methods
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

