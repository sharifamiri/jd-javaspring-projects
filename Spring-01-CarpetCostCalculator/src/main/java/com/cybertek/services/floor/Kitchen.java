package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Kitchen implements Floor {

    @Value("${radius}")
    private int radius;
    @Value("${pi}")
    private double pi;

    @Override
    public double getFloorArea() {
        return radius * radius * pi;
    }
}
