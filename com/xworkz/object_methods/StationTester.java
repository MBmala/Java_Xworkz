package com.xworkz.object_methods;

import com.xworkz.object_methods.dto.PoliceStationDTO;

public class StationTester {

	public static void main(String[] args) {

		Object dto = new PoliceStationDTO("Rajajnnagar", 10, "Rajajinagar Police Station");

		System.out.println(dto);// implicit calling toString()
		System.out.println(dto.toString());// explicit

		System.out.println(dto.hashCode());
		
		PoliceStationDTO dto1 =new PoliceStationDTO("Upparpet", 6, "Upparpet Police Station");
		System.out.println(dto1.hashCode());// Collections
		System.out.println(dto1);

		PoliceStationDTO dto2 = new PoliceStationDTO("Upparpet", 6, "Upparpet Police Station");
		//dto1=dto2;
		
		PoliceStationDTO dto3=new PoliceStationDTO("MG Road",3, "Upparpet Police Station");
		//boolean equal=dto1.equals("WORD");// it gives classCastException
		//boolean equal=dto3.equals(dto2);
		//boolean equal=dto.equals(dto1);
		boolean equal=dto3.equals(dto2);
	    equal=dto1.equals(dto2);
		System.out.println(equal);
		
		if(equal)
		{
			System.out.println("dto is equal");
		}
		else {
			System.out.println("dto is not equal");
		}
	}

}