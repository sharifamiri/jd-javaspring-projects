package com.cybertek;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.services.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring01CarpetCostCalculatorApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(Spring01CarpetCostCalculatorApplication.class, args);

//		Carpet carpetTX = container.getBean("carpetTX",Carpet.class);
//		Carpet carpetVA = container.getBean("carpetVA",Carpet.class);
//
//		carpetTX.getCarpetCost(City.Arlington);
//		System.out.println(carpetTX.getCarpetCost(City.Arlington));

		Calculator calculator = container.getBean("calculator",Calculator.class);
		System.out.println(calculator.getTotalPrice(City.Dallas));


	}

}
