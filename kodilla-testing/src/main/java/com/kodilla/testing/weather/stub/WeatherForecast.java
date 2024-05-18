package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String,Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        return resultMap;
    }
    public double calculateMeanTemperature() {
        double sumTemperature = 0;
        double meanTemperature;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sumTemperature = sumTemperature + temperature.getValue();
        }
        meanTemperature = sumTemperature / temperatures.getTemperatures().size();
        return meanTemperature;
    }
    public double calculateMedianTemperature() {
        double medianTemperature = 0;
        Collection<Double> values = temperatures.getTemperatures().values();
        ArrayList<Double> temperatureValueList = new ArrayList<>(values);
        System.out.println(temperatureValueList);
        Collections.sort(temperatureValueList);
        System.out.println(temperatureValueList);
        if (temperatureValueList.size() % 2 == 0) {
            medianTemperature = (temperatureValueList.get(temperatureValueList.size() / 2) + temperatureValueList.get(temperatureValueList.size() / 2 - 1)) /2;
        }else {
            medianTemperature = temperatureValueList.get(temperatureValueList.size() / 2);
        }
        return medianTemperature;
        }
}
