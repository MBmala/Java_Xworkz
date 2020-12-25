package com.xworkz.electronics.computer;

public class Laptop extends Computer {
	private String os;

	public void playMusic() {
		System.out.println("invoked playMusic");
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	

}
