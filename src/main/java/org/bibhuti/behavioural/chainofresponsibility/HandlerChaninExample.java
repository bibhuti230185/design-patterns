package org.bibhuti.behavioural.chainofresponsibility;

public class HandlerChaninExample {
    public static void main(String[] args) {
        SupportHandler level1Handler = new LevelOneSupportHandler();
        SupportHandler level2Handler = new LevelTwoSupportHandler();
        SupportHandler level3Handler = new LevelThreeSupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        ServiceRequest request1 = new ServiceRequest(ServiceLevel.LEVEL_ONE);
        ServiceRequest request2 = new ServiceRequest(ServiceLevel.LEVEL_TWO);
        ServiceRequest request3 = new ServiceRequest(ServiceLevel.LEVEL_THREE);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
    }
}
