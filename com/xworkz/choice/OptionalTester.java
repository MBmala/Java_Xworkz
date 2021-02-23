package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dao.GiftDAO;
import com.xworkz.choice.dao.GiftDAOImpl;
import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;

public class OptionalTester {
	public static void main(String[] args) {
		
	
	GiftDAO dao=new GiftDAOImpl();
	
	GiftDTO dto=new GiftDTO();
	dto.setGivenBy(Optional.of("Rohan"));
	dto.setType(Optional.of(GiftType.MUG));
	dto.setPrice(150);
	
	dao.save(dto);
	
	Optional<GiftDTO> opt=dao.fetchByGivenBy("Rohan");
	opt.ifPresent(v->System.out.println(v));
	}	

}
