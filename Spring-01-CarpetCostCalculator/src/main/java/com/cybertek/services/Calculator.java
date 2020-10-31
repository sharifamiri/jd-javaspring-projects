package com.cybertek.services;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Carpet carpet;
    private Floor floor;


    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalPrice(City city){
        double totalPrice = floor.getFloorArea() * carpet.getCarpetCost(city);
        return totalPrice;
    }
}
