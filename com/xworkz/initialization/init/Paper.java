package com.xworkz.initialization.init;

public class Paper {
	private  String brand="ClassMate";	
	 float width;	
	 float height;	
	public String color;
	
	public Paper(String brand,float width,float height,String color) {
		this.brand=brand;
		this.width=width;
		this.height=height;
		this.color=color;
	}
	//getter method

	public String getBrand() {
		return brand;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}
	
	
	public Paper()
	{
	height=24.0f;
	width=18.0f;
	//System.out.println("updated height:"+height);
	//System.out.println("updated width:"+width);
	}
	

	
}
