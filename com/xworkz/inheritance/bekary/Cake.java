package com.xworkz.inheritance.bekary;

public class Cake {
	private String flavor;
	private String shape;
	private double size;
	
	public boolean taste() {
	  System.out.println("invoked taste");
	  boolean retVal=true;
	  return retVal;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getFlavor() {
		return flavor;
	}
	public String getShape() {
		return shape;
	}
	public double getSize() {
		return size;
	}
	

}
