package com.xworkz.constructor;
import com.xworkz.constructor.constructor_exm.Coffee;

public class CoffeeTester {

	public static void main(String[] args) {
		
		Coffee coffee=new Coffee(2,"Bru");
		System.out.println(coffee.name);
		System.out.println(coffee.price);
		
		Coffee coffee1=new Coffee();
		coffee1.name="cappuccino";
		coffee1.price=200;
		System.out.println(coffee1.name);
		System.out.println(coffee1.price);
		
	}

	}


