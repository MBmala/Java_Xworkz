package com.xworkz.cosmetic.dao.impl;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class AdvanceCosmeticDAOImpl implements CosmeticDAO {

	public AdvanceCosmeticDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CosmeticDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
