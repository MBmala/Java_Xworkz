package com.xworkz.electronics.computer;

import com.xworkz.electronics.constants.Company;

public class Computer {
	private Company company;
	private double price;
	private String ram;

	public String process(String input, String instruction) {
		String output = instruction + " " + input;
		return output;
	}

	public void displayInfo() {
		System.out.println("invoked displayInfo");
		System.out.println(this.price);
		System.out.println(this.ram);
		System.out.println(this.company);
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

}
