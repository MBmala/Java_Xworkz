package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dto.WonderDTO;
import com.xworkz.choice.dto.WonderDTO.WonderType;

public class OptionalTester3 {
	public static void main(String[] args) {

		WonderDTO dto = new WonderDTO();
		dto.setName("Pyra");
		dto.setPlace("Egypt");
		dto.setPeriod(WonderType.BC);

		String name = dto.getName();
		System.out.println(name.toLowerCase());

		// Optional<String> optHesaru=Optional.of("Pyramid");
		// dto.setHesaru(optHesaru);
		dto.setHesaru(Optional.of("Pyramid"));

		Optional<String> temp = dto.getHesaru();
		System.out.println(temp.isPresent());
		temp.ifPresent(v -> System.out.println(v));

		String nameTemp = temp.get();
		if (nameTemp.contains("y")) {
			System.out.println("y is found");
		}
        //same as above using filter
		temp.filter(v -> v.contains("y")).ifPresent(v -> System.out.println("y is found"));

		// map

		String upperName = temp.map(v -> v.toUpperCase()).get();//map maps String->String
		System.out.println(upperName);

		temp.filter(v -> true).map(v -> v.toUpperCase()).ifPresent(v -> System.out.println(v + "y is uper case"));

		String mapped = temp.map(v -> "converted").get();
		System.out.println(mapped);
        
		//flatMap
		WonderDTO dto1 = temp.flatMap(v -> Optional.of(new WonderDTO())).get();//flatMap maps String->WonderDTO
		System.out.println(dto1);
		boolean value = temp.flatMap(v -> Optional.of(true)).get();//flatMap maps String->boolean
		System.out.println(value);

	}

}
