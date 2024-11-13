package org.bibhuti.behavioural.chainofresponsibility;

public class LevelOneSupportHandler implements SupportHandler {

    private SupportHandler next;

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getServiceLevel() == ServiceLevel.LEVEL_ONE) {
            System.out.println("Level one support is handling the request");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("No handler available for the request");
            }
        }
    }

    @Override
    public void setNextHandler(SupportHandler next) {
        this.next = next;
    }
}
