package com.xworkz.inheritance;

import com.xworkz.inheritance.bekary.Cake;
import com.xworkz.inheritance.bekary.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {
		Cake cake=new Cake();
		cake.setFlavor("chocalate");
		cake.setShape("sqare");
		cake.setSize(3.0);
		System.out.println(cake.getFlavor());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		boolean val=cake.taste();
		System.out.println(val);
		
		//inherit the members of Cake
		HoneyCake honeyCake=new HoneyCake(); 
		System.out.println(honeyCake.getFlavor());
		System.out.println(honeyCake.getShape());
		System.out.println(honeyCake.getSize());
		honeyCake.setHoney(true);
		System.out.println(honeyCake.isHoney());
		val=honeyCake.taste();
		System.out.println(val);

	}

}
