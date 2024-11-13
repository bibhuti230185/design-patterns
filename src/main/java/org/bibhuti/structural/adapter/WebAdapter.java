package org.bibhuti.structural.adapter;

import com.google.gson.Gson; // Importing Gson library for JSON conversion

public class WebAdapter implements WebRequester {

    private WebService service;
    private Gson gson = new Gson(); // Initialize Gson

    public void connect(WebService currentService) {
        this.service = currentService;
        /* Connect to the web service */
    }

    @Override
    public int request(Object request) {
        String result = this.toJson(request); // Convert to JSON string
        String response = service.request(result); // Assuming WebService.request accepts a JSON string
        if (response.equalsIgnoreCase("OK"))
            return 200; // OK status code
        return 500; // Server error status code
    }

    private String toJson(Object input) {
        return gson.toJson(input); // Convert object to JSON string
    }
}