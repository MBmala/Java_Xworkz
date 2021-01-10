package com.xworkz.redbus.contract;

import java.io.Serializable;
import java.util.Date;

public interface RedbusContract extends Serializable,Security,Contract {
//interface can extends multiple interface but interface can't implements interface
	//Serializable is marker interface
	public int minBooking();

	public boolean busWarranty();
	
	/**
	 * we can also implement static methods in interface
	 */
	public static void printDate(){
		System.out.println(new Date());
	}

}
