package org.bibhuti.behavioural.chainofresponsibility;

public interface SupportHandler {
    void handleRequest(ServiceRequest request);
    void setNextHandler(SupportHandler next);
}
