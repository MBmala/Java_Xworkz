package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO("MAC", CosmeticShades.IVORY, CosmeticType.FOUNDATION, 1000, 1);
		
		//List<CosmeticDTO> list=new LinkedList<CosmeticDTO>(); 
		//we can implement any type ie ArrayList or LinkedList (loose coupling)
		List<CosmeticDTO> cosmeticList=new ArrayList<CosmeticDTO>();
		CosmeticDAO dao = new CosmeticDAOImpl(cosmeticList);
		boolean added = dao.save(cosmeticDTO);
		System.out.println(added);
		
		added = dao.save(cosmeticDTO);
		System.out.println(added);
		
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO();
		cosmeticDTO2.setBrand("Maybelline");
		cosmeticDTO2.setCosmeticShades(CosmeticShades.BLACK);
		cosmeticDTO2.setCosmeticType(CosmeticType.EYELINER);
		cosmeticDTO2.setPrice(150);
		cosmeticDTO2.setQuantity(1);
		added = dao.save(cosmeticDTO2);
		System.out.println(added);
		
		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Lackmi", CosmeticShades.PINK, CosmeticType.EYESHADOW, 800, 2);
		added = dao.save(cosmeticDTO3);
		System.out.println(added);
		CosmeticDTO cosmeticDTO4 = new CosmeticDTO("revalon", CosmeticShades.RED, CosmeticType.LIPSTICK, 400, 1);
		added = dao.save(cosmeticDTO4);
		System.out.println(added);
		CosmeticDTO cosmeticDTO5 = new CosmeticDTO("nivea", CosmeticShades.PINK, CosmeticType.LIPSTICK, 200, 2);
		added = dao.save(cosmeticDTO5);
		System.out.println(added);
		CosmeticDTO cosmeticDTO6 = new CosmeticDTO("Sugar", CosmeticShades.TAN, CosmeticType.FOUNDATION, 500, 1);
		added = dao.save(cosmeticDTO6);
		System.out.println(added);
		
		System.out.println("-------------------------------------------------");
		int size=dao.totalSize();
		System.out.println(size);
		
		System.out.println("-------------------------------------------------");
		boolean updatedPriceQuantity=dao.updatePriceAndQuantityByBrand(400,1,"Lackmi");
		System.out.println("updated Price Quantity"+updatedPriceQuantity);
		
		System.out.println("-------------------------------------------------");
		boolean updatePrice=dao.updatePriceByBrandAndType(400,"Sugar",CosmeticType.FOUNDATION);
		System.out.println(updatePrice);
		
		System.out.println("-------------------------------------------------");
		boolean deleteBrand=dao.deleteByBrand("nivea");
		System.out.println("deleteBrand"+deleteBrand);
		
		System.out.println("-------------------------------------------------");
		size=dao.totalSize();
		System.out.println(size);
		
		System.out.println("-------------------------------------------------");
		List<CosmeticDTO> allCosmetics=dao.getAll();
		System.out.println(allCosmetics);
		
		System.out.println("-------------------------------------------------");
		boolean deleted=dao.deleteAll();
		System.out.println(deleted);
		
		System.out.println("-------------------------------------------------");
		size=dao.totalSize();
		System.out.println(size);
		
		
		//Collections.sort(cosmeticList);
		
		
		//for (CosmeticDTO  cosmetic:cosmeticList) {
		//	System.out.println(cosmetic.getBrand());
		//}
		
	}

}
