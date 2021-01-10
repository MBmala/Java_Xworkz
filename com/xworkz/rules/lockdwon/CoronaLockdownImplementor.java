package com.xworkz.rules.lockdwon;

public class CoronaLockdownImplementor implements CoronaLockdown{
	 public String country="china";

	@Override
	public int socialDistancing() {
	System.out.println("implemented socialDistancing");
		return 6;
	}

	@Override
	public void wearMask() {
		System.out.println("implemented wearMask");
	}

	@Override
	public String sanitize() {
		System.out.println("implemented sanitize");
		return "sanitize hands";
	}
	

}
