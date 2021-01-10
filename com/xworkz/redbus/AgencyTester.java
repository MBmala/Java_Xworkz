package com.xworkz.redbus;

import java.io.Serializable;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.Contract;
import com.xworkz.redbus.contract.RedbusContract;
import com.xworkz.redbus.contract.Security;
import com.xworkz.redbus.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {

		
		RedbusContract contract=new RedbusContractImplementor();
				
		TravelAgency agency=new TravelAgency(contract);
		//abstraction:here TravelAgency dont know the implementation but it uses the functionality of vrl
		agency.acceptBooking();
	
		RedbusContract.printDate();//static method
		
		Object obj=new RedbusContractImplementor();
		Serializable ct=new RedbusContractImplementor();
		Security secu=new RedbusContractImplementor();
		Contract con=new RedbusContractImplementor();
		
	}

}
