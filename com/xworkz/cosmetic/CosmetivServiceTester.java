package com.xworkz.cosmetic;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.impl.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service.CosmeticService;
import com.xworkz.cosmetic.service.impl.CosmeticServiceImpl;

public class CosmetivServiceTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO("MAC", CosmeticShades.IVORY, CosmeticType.FOUNDATION, 1000, 1);
		// CosmeticService cosmeticServiceImpl=new CosmeticServiceImpl();
		// cosmeticServiceImpl.validateAndSave(cosmeticDTO);
		List<CosmeticDTO> list = new LinkedList<CosmeticDTO>();

		CosmeticDAO dao = new CosmeticDAOImpl(list);

		CosmeticService service = new CosmeticServiceImpl(dao);

		service.validateAndSave(cosmeticDTO);

		
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Sugr", CosmeticShades.RED, CosmeticType.PRIMER, 1000, 2);

		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());

		service.deleteByBrand("Sugr");

		System.out.println(service.cosmeticsSize());

	}

}
