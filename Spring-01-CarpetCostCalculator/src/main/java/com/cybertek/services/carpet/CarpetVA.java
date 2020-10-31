package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City,BigDecimal> sqCostForCity = new HashMap<>();

    static {
        sqCostForCity.put(City.MC_LEAN,new BigDecimal(4.32));
        sqCostForCity.put(City.ARLINGTON, new BigDecimal(2.92));
        sqCostForCity.put(City.FAIRFAX,new BigDecimal(4.65));
    }

    @Override
    public BigDecimal getSqFtCost(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        var collect = sqCostForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();
//        Optional<Map.Entry<City,BigDecimal>> collect =

        return collect.isPresent() ? collect.get().getValue() : defaultValue;


        //2ND WAY
//        return sqCostForCity.get(city) != null ? sqCostForCity.get(city): BigDecimal.ZERO;

        //2ND WAY to clarify
//        switch (city){
//            case Arlington:
//                return BigDecimal.valueOf(10);
//            case Fairfax:
//                return BigDecimal.valueOf(9);
//            case McLean:
//                return BigDecimal.valueOf(11);
//            default:
//                throw new IllegalArgumentException("City is not in our records");
//        }
    }
}
