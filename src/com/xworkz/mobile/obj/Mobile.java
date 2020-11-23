package com.xworkz.mobile.obj;

public class Mobile {
	
	public String model;
	public String color;
	public int ram ;
	public String camera;
	public static int battery;
	
	public void displayInfo()
	{
		System.out.println("invoked displayInfo");
		System.out.println(model);
		System.out.println(color);
		System.out.println(ram);
		System.out.println(camera);
		System.out.println(battery);
	}

}
