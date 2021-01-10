package com.xworkz.redbus.agency;

import com.xworkz.redbus.contract.RedbusContract;

public class TravelAgency {

	private RedbusContract contract;// has-a relation

	private String agencyName = new String("Madhu Shree Travel Agency");

	public TravelAgency(RedbusContract contract) {
		System.out.println("Created TravelAgency");
		this.contract = contract;
	}

	//abstraction
	public void acceptBooking() {
		System.out.println("invoked acceptBooking");
		System.out.println("checking bookings for" + this.agencyName);
		boolean warranty = contract.busWarranty();
		if (warranty) {
			System.out.println("bus is under warranty");
			int min = contract.minBooking();
			if (min > 0 && min <= 20) {
				System.out.println("can accept booking");
			} else {
				System.out.println("cannot accept booking");
			}

		} else {
			System.out.println("bus is not under warranty");
		}
	}

	@Override
	public TravelAgency clone() throws CloneNotSupportedException {
		return (TravelAgency) super.clone();
	}

	public String getAgencyName() {
		return agencyName;

	}
}
