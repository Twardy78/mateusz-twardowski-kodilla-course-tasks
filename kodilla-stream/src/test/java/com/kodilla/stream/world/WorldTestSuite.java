package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Country country1 = new Country("Poland",new BigDecimal("39875264"));
        Country country2 = new Country("Germany",new BigDecimal("69785258"));
        Country country3 = new Country("United States",new BigDecimal("278923155"));
        Country country4 = new Country("Canada",new BigDecimal("145932822"));
        Country country5 = new Country("United Kingdom",new BigDecimal("102874596"));
        Country country6 = new Country("China",new BigDecimal("1502874596"));
        Country country7 = new Country("India",new BigDecimal("1452367594"));
        Country country8 = new Country("Japan",new BigDecimal("126345544"));
        Country country9 = new Country("Spain",new BigDecimal("99699322"));
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("North America");
        Continent continent3 = new Continent("Asia");
        //Then
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country5);
        continent1.addCountry(country9);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent3.addCountry(country6);
        continent3.addCountry(country7);
        continent3.addCountry(country8);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        BigDecimal result = world.getAllPopulation();
        //When
        assertEquals(new BigDecimal("3818678151"),result);
    }
}
