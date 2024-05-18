package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach void test() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Kraków", 23.1);
        temperaturesMap.put("Katowice", 21.4);
        temperaturesMap.put("Opole", 20.6);
        temperaturesMap.put("Wroclaw", 22.4);
        temperaturesMap.put("Gdynia", 18.6);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }
    @Test
    void testWeatherForecastWithMock(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testMeanTemparatureCalculation(){
        //Given
        double expectedMeanTemp = 21.22;
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double meanValue = weatherForecast.calculateMeanTemperature();
        //Then
        Assertions.assertEquals(expectedMeanTemp, meanValue);
    }
    @Test
    void testMedianTemperatureCalculation(){
        //Given
        double expextedMedianTemp = 21.40;
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double medianValue = weatherForecast.calculateMedianTemperature();
        //Then
        Assertions.assertEquals(expextedMedianTemp, medianValue);
    }
}
