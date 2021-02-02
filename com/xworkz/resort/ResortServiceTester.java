package com.xworkz.resort;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceImpl;

public class ResortServiceTester {

	public static void main(String[] args) {
		List<ResortDTO> list = new ArrayList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);
		ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("Ramanagar", "Shillandara", "KiranRaj", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829446971L);
		dto.setPoolExist(false);
		dto.setRating(4);

		resortService.validateAndSave(dto);
		System.out.println("-------------------------------------------------------");
		ResortDTO dto2 = new ResortDTO("coorg","JavaRainCKM", "Omkar", 10);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(15);
		dto2.setOffers(false);
		dto2.setPhoneNo(7829557108L);
		dto2.setPoolExist(true);
		dto2.setRating(4);

		resortService.validateAndSave(dto2);

		System.out.println("-------------------------------------------------------");
		System.out.println(resortService.totalResortSize());
		
		System.out.println("-------------------------------------------------------");
		resortService.addMultipleResorts(list);//same resorts are added
		System.out.println(resortService.totalResortSize());
		
		System.out.println("-------------------------------------------------------");
		resortService.updateLocationByName("Chikmagalur", "JavaRainCKM");
		List<ResortDTO> all=resortService.getAll();
		System.out.println(all);
		
		System.out.println("-------------------------------------------------------");
		resortService.updateLocationByNameandRating("Madikeri", "Shillandara", 4);
		all=resortService.getAll();
		System.out.println(all);

		System.out.println("-------------------------------------------------------");
		resortService.deleteByNameAndLocation("Shillandara", "Madikeri");
		System.out.println(resortService.totalResortSize());

	}
}
