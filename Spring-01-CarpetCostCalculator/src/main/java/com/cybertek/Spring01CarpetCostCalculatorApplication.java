package com.cybertek;

import com.cybertek.enums.City;
import com.cybertek.services.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring01CarpetCostCalculatorApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext container = SpringApplication.run(Spring01CarpetCostCalculatorApplication.class, args);

		Calculator calculator = container.getBean("calculator",Calculator.class);

		System.out.println(calculator.getTotalPrice(City.DALLAS));


	}

}
