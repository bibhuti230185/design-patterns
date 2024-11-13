package org.bibhuti.behavioural.state;

public class ReadyState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Ready state: Please select a product.");
    }
}
