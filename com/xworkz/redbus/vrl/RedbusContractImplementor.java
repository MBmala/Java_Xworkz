package com.xworkz.redbus.vrl;

import com.xworkz.redbus.contract.RedbusContract;

public class RedbusContractImplementor implements RedbusContract {
//clas can implements only one interface
	

	@Override
	public int minBooking() {
		System.out.println("invoked minBooking");
		return 20;
	}

	@Override
	public boolean busWarranty() {
		System.out.println("invoked busWarranty");
		return true;
	}
	
	@Override
	public void open() {
		System.out.println("invoked open");		
	}

	@Override
	public int maxBooking() {
		System.out.println("invoked maxBooking");
		return 40;
	}

}