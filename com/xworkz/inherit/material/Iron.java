package com.xworkz.inherit.material;

import com.xworkz.inherit.raw_material.RawMaterial;

public class Iron extends RawMaterial {
	public Iron() {
		super();
		System.out.println("invoked Iron");
	}

	public Iron(String name) {
		super();
		super.name = name;
		System.out.println("invoked Iron");
		System.out.println(super.name);
	}

	
	  //super.name="iron ore"; use super within the constructor/method/block only
	  
	  
	 /*RawMaterial rawMaterial= new Iron();
	 rawMaterial.name="iron ore";*/

	@Override
	public void delivery() {
		System.out.println("delivery by road");
		 super.name="iron ore";
		 
	}

	public void manufacture() {
		System.out.println("invoked manufacture of Iron");
	}
}
