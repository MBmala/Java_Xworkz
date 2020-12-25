package com.xworkz.electronics.computer;

public class DesktopComputer extends Computer {
	private boolean power;

	public void turnOn() {
		if (this.power) {
			System.out.println("Desktop is turned on");
		} else {
			System.out.println("plz switch on the power");
		}
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

}
