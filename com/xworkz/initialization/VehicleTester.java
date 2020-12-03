package com.xworkz.initialization;

import com.xworkz.initialization.init.Vehicle;

public class VehicleTester {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("1/10/2020","Tesla","1HGBH41JXMN109186");
		String date=vehicle.getMfgDate();
		String company=vehicle.getCompany();
		String chassisNum=vehicle.getChassisNo();
		
		
		System.out.println(date);
		System.out.println(company);
		System.out.println(chassisNum);
		
		String colorName=args[0];
		String ownerName=args[1];
		vehicle.setColor(colorName);
		vehicle.setOwnerName(ownerName);
		
		String color=vehicle.getColor();
		String owner=vehicle.getOwnerName();
		System.out.println(color);
		System.out.println(owner);
		
	}

}
