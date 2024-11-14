package org.bibhuti.structural.observer;

public interface Subject {
    public void registerObserver(Observer2 observer);
    public void removeObserver(Observer2 observer);
    public void notifyObservers();
}
