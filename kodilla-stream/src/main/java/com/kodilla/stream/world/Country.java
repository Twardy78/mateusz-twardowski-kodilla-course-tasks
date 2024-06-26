package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.*;
import java.util.stream.Collectors;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(final String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName(){
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(peopleQuantity, country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(peopleQuantity);
    }
}
