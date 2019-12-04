package com.microservices.portmoduleservice.beans;

public class PortDetails {

	private int id;
	private String name;
	private String location;
	private int numberOfIntancePort;
	private int quantity;
	private int numberOfShips;
	public PortDetails(int id, String name, String location, int numberOfIntancePort, int quantity,
			int numberOfShips) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.numberOfIntancePort = numberOfIntancePort;
		this.quantity = quantity;
		this.numberOfShips = numberOfShips;
	}
	protected PortDetails() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumberOfIntancePort() {
		return numberOfIntancePort;
	}
	public void setNumberOfIntancePort(int numberOfIntancePort) {
		this.numberOfIntancePort = numberOfIntancePort;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getNumberOfShips() {
		return numberOfShips;
	}
	public void setNumberOfShips(int numberOfShips) {
		this.numberOfShips = numberOfShips;
	}
	
	
}
