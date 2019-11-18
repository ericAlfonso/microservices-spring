package com.microservices.cargomoduleservice.beans;

public class CargoConfiguration {

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



	protected CargoConfiguration() {
		super();
	}



	public CargoConfiguration(int priceOfDelivery, int priceOfShipping) {
		super();
		this.priceOfDelivery = priceOfDelivery;
		this.priceOfShipping = priceOfShipping;
	}
	
	
}
