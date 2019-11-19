package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final  class World {
    private final List<Continent> continentList = new ArrayList<>();

    public boolean addContinentToWorldList (Continent continent){
        return continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal populationOfWorld = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

                return populationOfWorld;
    }
}
