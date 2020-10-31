package com.cybertek.services;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {

    @Qualifier("carpetTX")
    @Autowired
    private Carpet carpet;

    @Qualifier("bedroom")
    @Autowired
    private Floor floor;


    public String getTotalPrice(City city) throws Exception{

        BigDecimal price = carpet.getSqFtCost(city).multiply(floor.getArea());

        if (price.compareTo(BigDecimal.ZERO) == 0){
            throw new Exception("This city does not exist");
        }

        return "Total Price of Carpet: " + price;
    }
}
