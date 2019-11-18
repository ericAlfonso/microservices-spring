package com.microservices.cargomoduleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.cargomoduleservice.Configuration;
import com.microservices.cargomoduleservice.beans.CargoConfiguration;

@RestController
public class CargoController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/cargo")
	public CargoConfiguration prueba() {
		return new CargoConfiguration(configuration.getPriceOfDelivery(), configuration.getPriceOfShipping());
	}
}
