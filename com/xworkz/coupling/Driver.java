package com.xworkz.coupling;

public class Driver {

	private String name ;
	private Vehicle vehicle;
	//private Vehicle vehicle=new TruckVehicle();//tight coupling

	public Driver(String name,Vehicle vehicle) {
		//loose coupling
	this.name=name;
	this.vehicle=vehicle;
	}
	
	public void drive() {
		System.out.println("driving by" + this.name);
		this.vehicle.move();
	}

}
