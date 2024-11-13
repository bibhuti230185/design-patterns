package org.bibhuti.behavioural.chainofresponsibility;

public class ServiceRequest {
    private ServiceLevel serviceLevel;


    public ServiceRequest(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;

    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


}
