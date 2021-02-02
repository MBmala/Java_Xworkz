package com.xworkz.coupling;

public class DriverTester {
	public static void main(String[] args) {
		Vehicle vehicle=new TruckVehicle();
		//Vehicle vehicle=new ScootyVehicle(); 
		//we can give any impl of the vehicle(TruckVehicle()/ScootyVehicle())
		//we can achieve loose coupling through interface
		Driver driver = new Driver("mala",vehicle);
		driver.drive();
	}
}
