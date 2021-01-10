package com.xworkz.inheritance;

import com.xworkz.inheritance.amazon.AmazonEcommerce;
import com.xworkz.inheritance.ecommerce.Ecommerce;
import com.xworkz.inheritance.ecommerce.Vendor;

public class VendorTester {

	public static void main(String[] args) {
		Ecommerce ecommerce=new Ecommerce();
		Vendor vendor = new Vendor(ecommerce);
		vendor.delivery();// it prints default value
		
		
		AmazonEcommerce amazonEcommerce=new AmazonEcommerce(true);
		System.out.println(amazonEcommerce.getLocation());
		amazonEcommerce.changeLocation();
		System.out.println(amazonEcommerce.getLocation());

	}

}

