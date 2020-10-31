package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class LivingRoom implements Floor {

    @Value("${width}")
    private int width;
    @Value("${height}")
    private int height;

    @Override
    public double getFloorArea() {
        return width * height;
    }
}
