package com.microservices.schedulemoduleservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Port {

	@Id
	private int id;
	private String name;
	private String location;
	private int numberOfIntancePort;
	
	
	public int getNumberOfIntancePort() {
		return numberOfIntancePort;
	}
	public void setNumberOfIntancePort(int numberOfIntancePort) {
		this.numberOfIntancePort = numberOfIntancePort;
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
	public Port(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	protected Port() {
		super();
	}
	
	
}
