package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CarpetTX implements Carpet {


    @Override
    public double getCarpetCost(City city) {
        switch (city){
            case Dallas:
                return 6;
            case Austin:
                return 5;
            case SanAntonio:
                return 4;
            default:
                throw new IllegalArgumentException("City is not in our records");
        }
    }
}
