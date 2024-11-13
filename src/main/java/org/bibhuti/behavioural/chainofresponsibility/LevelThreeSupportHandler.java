package org.bibhuti.behavioural.chainofresponsibility;

public class LevelThreeSupportHandler implements SupportHandler {

    private SupportHandler next;

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getServiceLevel() == ServiceLevel.LEVEL_THREE) {
            System.out.println("Level Three Support is handling the request");
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
       // No need to check for null as we are using constructor to set the next handler

    }
}
