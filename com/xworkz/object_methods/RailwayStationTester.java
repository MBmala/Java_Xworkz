package com.xworkz.object_methods;

import com.xworkz.object_methods.dto.PoliceStationDTO;
import com.xworkz.object_methods.dto.RailwatStationDTO;

public class RailwayStationTester {

	public static void main(String[] args) {
		RailwatStationDTO railwatStationDTO=new RailwatStationDTO("yashvanthpur",0,"YRS");
		
		RailwatStationDTO majestic=new RailwatStationDTO("Majestic",3,"MRS");
		System.out.println(majestic.equals(railwatStationDTO));
		System.out.println(majestic.hashCode());
		System.out.println(railwatStationDTO.hashCode());
		System.out.println(System.identityHashCode(majestic));
		System.out.println(System.identityHashCode(railwatStationDTO));
		
		System.out.println("--------------------------------------");
		PoliceStationDTO policeStationDTO=new PoliceStationDTO("vijaynagar",2,"VPS");
		System.out.println(policeStationDTO.equals(majestic));
	}

}
