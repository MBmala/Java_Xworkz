package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;
import com.xworkz.choice.dto.WarDTO;

public class OptionalTester2 {
	public static void main(String[] args) {

		GiftDTO dto=new GiftDTO();
		//dto.setType(GiftType.FLOWER);
		dto.setPrice(20);
		Optional<GiftType> optGiftType=
				Optional.ofNullable(GiftType.MUG);
		dto.setType(optGiftType);
		
		Optional<GiftType> type=dto.getType();
		
		//type.ifPresent(System.out::println);-->functinal reference
		
		type.ifPresent(r->System.out.println(r));
		
		
		dto.setGivenBy(Optional.ofNullable("rani"));
		
		dto.getGivenBy().ifPresent(v->System.out.println(v.toUpperCase()));
		dto.getGivenBy().map(String::toUpperCase);//functional ref
		
	
	
		WarDTO warDTO=new WarDTO();
		
		
		warDTO.setCountry("India");
		warDTO.setName("Kargil");
		System.out.println(warDTO);
		
		
		
	}

}
