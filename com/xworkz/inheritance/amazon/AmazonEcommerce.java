package com.xworkz.inheritance.amazon;

import com.xworkz.inheritance.ecommerce.Ecommerce;

public class AmazonEcommerce extends Ecommerce {

	public AmazonEcommerce(boolean payOnDelivery) {
		super();
		System.out.println("invoked AmazonEcommerce ");
		super.payOnDelivery = payOnDelivery;
		System.out.println(super.payOnDelivery);
	}
	
	public void changeLocation() {
		//super.location="UK"; bcz it is private
		super.setLocation("UK");
	}

}
