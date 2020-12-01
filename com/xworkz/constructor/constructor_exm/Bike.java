package com.xworkz.constructor.constructor_exm;

public class Bike {
	public String color="gray";//instance variable

	public Bike(String bikeColor)//constructor
	{
		System.out.println("Invoked Bike constructor");
		System.out.println("argument value befor::" +color);
		color=bikeColor;
		System.out.println("argument value after::" +bikeColor);
	}

}




