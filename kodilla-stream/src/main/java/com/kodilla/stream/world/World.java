package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public final List<Continent> continents = new ArrayList<>();

    public void addContinent(final Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getAllPopulation() {
        return continents.stream()
                .flatMap(p -> p.getCountriesInContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        }
}
