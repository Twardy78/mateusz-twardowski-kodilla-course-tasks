package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;
import java.util.stream.*;

public final class Continent {

    private final String continentName;
    private final List<Country> countriesInContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }
    public void addCountry(Country country) {
        countriesInContinent.add(country);
    }
    public String getContinentName() {
        return continentName;
    }
    public List<Country> getCountriesInContinent() {
        return countriesInContinent;
    }
    public Set<BigDecimal> getPopulationFormCountry(){
        return countriesInContinent.stream()
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toSet());
    }

}
