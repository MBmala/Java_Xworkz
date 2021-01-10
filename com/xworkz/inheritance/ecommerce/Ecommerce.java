package com.xworkz.inheritance.ecommerce;

public class Ecommerce {
	protected  boolean payOnDelivery;
     private String location="INDIA";
	public Ecommerce() {
		super();
	}
	public String getLocation() {
		return location;
	}
	protected void setLocation(String location) {
		this.location = location;
	}

}
