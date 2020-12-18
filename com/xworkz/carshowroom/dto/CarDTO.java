package com.xworkz.carshowroom.dto;

import com.xworkz.carshowroom.constants.CarVariant;

public class CarDTO {
	private String model;
	private double price;
	private CarVariant carveriant;
	
	public CarDTO() {
	System.out.println("Welcome to car showroom");
	}
	
	public CarDTO(String model, double price, CarVariant carveriant) {
		super();
		this.model = model;
		this.price = price;
		this.carveriant = carveriant;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarVariant getCarveriant() {
		return carveriant;
	}
	public void setCarveriant(CarVariant carveriant) {
		this.carveriant = carveriant;
	}
	
	

}
