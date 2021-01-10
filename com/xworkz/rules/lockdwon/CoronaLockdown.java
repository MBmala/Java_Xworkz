package com.xworkz.rules.lockdwon;

public  interface CoronaLockdown {
	//public static final String country="India";//defautl modifiers for contants in interface
	String country="India";
	//private int age; not allowed
	
	 public int socialDistancing();//defautl modifiers public abstract for methos in interface
	
	void wearMask();
	
	String sanitize();

}
