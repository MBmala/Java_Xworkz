package com.xworkz.inheritance.ecommerce;

public class Vendor {
	 private Ecommerce ecommerce;
	public Vendor(Ecommerce ecommerce) {
		System.out.println("invoked Vendor constructor with ecommerce");
		this.ecommerce=ecommerce;
	}
	
	public void delivery() {
		System.out.println("invoked delivery");
		System.out.println(ecommerce.payOnDelivery);
	}

}
