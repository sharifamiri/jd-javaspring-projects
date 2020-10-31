package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CarpetVA implements Carpet {


    @Override
    public double getCarpetCost(City city) {
        switch (city){
            case Arlington:
                return 10;
            case Fairfax:
                return 9;
            case McLean:
                return 11;
            default:
                throw new IllegalArgumentException("City is not in our records");
        }
    }
}
