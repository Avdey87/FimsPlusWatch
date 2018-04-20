package com.aavdeev.fimspluswatch;

import java.util.ArrayList;
import java.util.List;

public class CarBrand {
    List<String> getCarBrand(String country) {
        List<String> brands = new ArrayList<String>();
        if (country.equals("USA")) {
            brands.add("Ford");
            brands.add("Corvet");
            brands.add("Mustang");
        }
        if (country.equals("Germany")) {
            brands.add("BMW");
            brands.add("Mersedes");
            brands.add("Audi");
        }
        if (country.equals("RUSSIA")) {
            brands.add("UAZ");
            brands.add("LADA");
            brands.add("KAMAZ");
        }
        return brands;
    }
}
