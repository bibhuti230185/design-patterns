package org.bibhuti.structural.observer;

import java.util.ArrayList;

public class Channel implements Subject {
    private ArrayList<Observer2> observers = new ArrayList<Observer2>();
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer2 obs : observers) {
            obs.update(this.status);
        }
    }

    public void registerObserver(Observer2 observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer2 observer) {
        observers.remove(observer);
    }
}
