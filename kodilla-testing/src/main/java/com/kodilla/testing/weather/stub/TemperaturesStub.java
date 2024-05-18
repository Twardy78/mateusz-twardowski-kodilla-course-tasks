package com.kodilla.testing.weather.stub;

import java.util.*;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        //Dummy list
        stubResult.put("Kraków", 23.1);
        stubResult.put("Katowice", 21.4);
        stubResult.put("Opole", 20.6);
        stubResult.put("Wroclaw", 22.4);
        stubResult.put("Gdynia", 18.6);

        return stubResult;
    }
}
