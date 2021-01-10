package com.xworkz.clone;

import com.xworkz.clone.dto.ZooDTO;

public class ZooTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ZooDTO dto = new ZooDTO("sri Chamarajendra Zoological garden", 1400, true, 100, true);
		System.out.println(dto.toString());
		System.out.println(dto.hashCode());

		ZooDTO copy = dto.clone();
		System.out.println(copy.getName() + " " + copy.getNoOfAnimals() + " " + copy.isOpen());
		System.out.println(copy.getEntryFees() + " " + copy.isSafari());
		System.out.println(dto.equals(copy));

	}

}
