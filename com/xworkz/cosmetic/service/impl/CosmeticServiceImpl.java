package com.xworkz.cosmetic.service.impl;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service.CosmeticService;

public class CosmeticServiceImpl implements CosmeticService {
	private CosmeticDAO cosmeticDAO;

	/*
	 * public CosmeticServiceImpl() { 
	 * //this.cosmeticDAO=new CosmeticServiceImpl();//tight coupling 
	 * }
	 */

	public CosmeticServiceImpl(CosmeticDAO cosmeticDAO) {
		System.out.println("Created CosmeticServiceImpl");
		this.cosmeticDAO = cosmeticDAO;

	}

	@Override
	public boolean validateAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println(" cosmeticDTO is not null,can we add fields");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is not valid");
				validData = false;
			}

			if (validData) {
				CosmeticShades shades = cosmeticDTO.getCosmeticShades();
				if (shades != null) {
					System.out.println("shade is valid");
					validData = true;
				} else {
					System.out.println("shade is not valid");
					validData = false;
				}
			}
			if (validData) {
				CosmeticType type = cosmeticDTO.getCosmeticType();
				if (type != null) {
					System.out.println("type is valid");
					validData = true;
				} else {
					System.out.println("type is not valid");
					validData = false;
				}
			}
			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 0) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is not valid");
					validData = false;
				}
			}
			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity < 100) {
					System.out.println("quantity is valid");
					validData = true;
				} else {
					System.out.println("quantity is not valid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("data is valid , can invoke dao");
				// CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
				cosmeticDAO.save(cosmeticDTO);

			}

		} else {
			System.out.println("dto is null, invalid data");
		}

		return false;
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		if (brand != null && !brand.isEmpty() && !brand.contains(" ") && brand.length() >= 3) {
			System.out.println("brand is valid, can delete" + brand);
			this.cosmeticDAO.deleteByBrand(brand);
		} else {
			System.out.println("invalid brand");
		}

	}

	@Override
	public int cosmeticsSize() {

		return this.cosmeticDAO.totalSize();
	}

}
