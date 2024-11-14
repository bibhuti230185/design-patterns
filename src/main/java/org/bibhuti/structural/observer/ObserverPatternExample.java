package org.bibhuti.structural.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);
        weatherStation.setTemperature(33.0f);
        weatherStation.setTemperature(34.0f);
    }
}
