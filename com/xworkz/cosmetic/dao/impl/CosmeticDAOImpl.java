package com.xworkz.cosmetic.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmetics;
	// we can init using (literal,default constructor,parameter constructor, set
	// method)

	/*
	 * public CosmeticDAOImpl() { this.cosmetics = new
	 * ArrayList<CosmeticDTO>();//initializing cosmetics //tight coupling }
	 */
	public CosmeticDAOImpl(List<CosmeticDTO> list) {
		this.cosmetics = list;// loose coupling
		System.out.println("Created CosmeticDAOImpl");
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);// it avoids adding multiple elements
		// if(!this.cosmetics.contains(dto))
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added) {
			System.out.println("cosmetic added" + dto);
		} else {

			System.out.println("cosmetic not added");
		}
		return added;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		System.out.println(" for " + brand + " brand");
		System.out.println("updated price:" + price);
		System.out.println("updated quantity:" + quantity);

		for (CosmeticDTO cosmeticDTO : this.cosmetics) {

			if (cosmeticDTO.getBrand().equals(brand)) {
				System.out.println(brand + " cosmetic found");
				cosmeticDTO.setPrice(price);
				cosmeticDTO.setQuantity(quantity);
				System.out.println("updated: " + cosmeticDTO);
				return true;
			}

		}
		System.out.println("cannot update cosmetic");
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandAndType");
		System.out.println(" for " + brand + " brand" + type);
		System.out.println("updated price:" + price);
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			if (cosmeticDTO.getBrand().equals(brand) && cosmeticDTO.getCosmeticType().equals(type)) {
				cosmeticDTO.setPrice(price);
				System.out.println("updated: " + cosmeticDTO);
				return true;
			}

		}
		System.out.println("cannot update cosmetic");
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		System.out.println("invoked updateTypeByBrand");
		System.out.println(" for " + brand + " brand");
		System.out.println("updated Cosmetic type:" + type);
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			if (cosmeticDTO.getBrand().equals(brand)) {
				cosmeticDTO.setCosmeticType(type);
				System.out.println("updated: " + cosmeticDTO);
				return true;
			}
		}
		System.out.println("cannot update cosmetic type");
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		//System.out.println("invoked deleteByBrand");
		for (CosmeticDTO cosmeticDTO : this.cosmetics) {
			if (cosmeticDTO.getBrand().equals(brand)) {
				this.cosmetics.remove(cosmeticDTO);
				System.out.println(brand + " cosmetic removed");
				return true;
			}
		}
		System.out.println("cant delete cosemetic of " + brand + " brand");
		return false;
	}
	/*
	 * public boolean deleteByBrand(String brand) {
	 * 
	 * Iterator<CosmeticDTO> iterator=this.cosmetics.iterator();
	 * while(iterator.hasNext()) { CosmeticDTO dto=iterator.next();
	 * if(dto.getBrand().equals(brand)) { iterator.remove(); return true; } } return
	 * false; }
	 */

	@Override
	public boolean deleteAll() {
		System.out.println("invoked deleteAll");
		// this.cosmetics.removeAll(cosmetics); it also works
		if (this.cosmetics != null) {
			this.cosmetics.clear();
			System.out.println("removed all cosmetics");
			return true;
		}
		return false;
	}

	@Override
	public List<CosmeticDTO> getAll() {
		System.out.println("invoked getAll");
		System.out.println("cosmetics are:");
		return this.cosmetics;
	}

	@Override
	public int totalSize() {
		System.out.println("invoked totalSize");
		return this.cosmetics.size();
         //OR
		/*
		 * public int totalSize() { System.out.println("invoked totalSize"); int size =
		 * this.cosmetics.size(); // System.out.println("number of cosmetics: "+size);
		 * return size; }
		 */

	}
}
