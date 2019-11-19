package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String continentName;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }


}
