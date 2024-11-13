package org.bibhuti.structural.adapter;

public class AdapterExample {
    public static void main(String[] args) {

        WebService service = new WebService();
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();
    }
}
