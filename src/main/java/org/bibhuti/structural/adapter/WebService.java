package org.bibhuti.structural.adapter;

public class WebService {


    public String request(String request) {
        // Process the request and return a response
        if (request != null && !request.isEmpty()) {
            return "Ok";
        }
        return "Error";
    }
}
