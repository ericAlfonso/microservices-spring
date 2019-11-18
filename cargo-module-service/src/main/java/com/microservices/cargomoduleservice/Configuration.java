package com.microservices.cargomoduleservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("cargo-module-service")
@Component
public class Configuration {

	private int priceOfDelivery;
	private int priceOfShipping;
	
	public int getPriceOfDelivery() {
		return priceOfDelivery;
	}
	public void setPriceOfDelivery(int priceOfDelivery) {
		this.priceOfDelivery = priceOfDelivery;
	}
	public int getPriceOfShipping() {
		return priceOfShipping;
	}
	public void setPriceOfShipping(int priceOfShipping) {
		this.priceOfShipping = priceOfShipping;
	}
	
}
