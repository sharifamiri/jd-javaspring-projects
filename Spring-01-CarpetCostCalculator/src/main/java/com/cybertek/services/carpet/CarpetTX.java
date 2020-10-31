package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City,BigDecimal> sqCostForCity = new HashMap<>();

    static {
        sqCostForCity.put(City.AUSTIN,new BigDecimal(1.32));
        sqCostForCity.put(City.DALLAS, new BigDecimal(1.75));
        sqCostForCity.put(City.SAN_ANTONIO,new BigDecimal(2.20));
    }


    @Override
    public BigDecimal getSqFtCost(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        Optional<Map.Entry<City,BigDecimal>> collect = sqCostForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
