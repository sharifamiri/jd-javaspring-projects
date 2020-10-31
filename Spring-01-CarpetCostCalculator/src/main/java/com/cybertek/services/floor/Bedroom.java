package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Primary
@Component
@PropertySource("classpath:application.properties")
public class Bedroom implements Floor {

    @Value("${side}")
    private int side;

    @Override
    public double getFloorArea() {
        return side * side;
    }
}
