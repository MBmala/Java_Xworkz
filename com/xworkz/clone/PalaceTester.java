package com.xworkz.clone;

import com.xworkz.clone.dto.PalaceDTO;

public class PalaceTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		PalaceDTO dto = new PalaceDTO();
		System.out.println(dto);
		System.out.println(dto.hashCode());
		dto.setLocation("mysore");
		dto.setKingName("Yaduveer");
		dto.setQueenName("Trishika");
		System.out.println(dto.getLocation());
		System.out.println(dto.getKingName());
		System.out.println(dto.getQueenName());

		System.out.println("----------------------------------------------------");
		Object obj = dto.clone();
		PalaceDTO casted = (PalaceDTO) obj;
		System.out.println(casted.getLocation() + " " + casted.getKingName() + " " + casted.getQueenName());

		System.out.println("----------------------------------------------------");
		System.out.println(dto.toString());
		System.out.println(casted.equals(dto));

		System.out.println("----------------------------------------------------");
		PalaceDTO dto1 = new PalaceDTO();
		System.out.println(dto1.equals(dto));//it checkes 2 ref pointing to same object
		System.out.println(dto1==dto);//it checkes 2 ref pointing to same memory
	}

}
