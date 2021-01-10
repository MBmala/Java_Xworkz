package com.xworkz.inherit.raw_material;

public abstract class RawMaterial {
protected String name;
	
	protected  RawMaterial() {
		System.out.println("invoked RawMaterial Constrcutor");
	}
	public void delivery() {
		System.out.println("delivery by road");
	}
	
	public abstract void manufacture();

}




