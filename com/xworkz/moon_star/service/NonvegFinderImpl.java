package com.xworkz.moon_star.service;

import com.xworkz.moon_star.dto.MenuDTO;
import com.xworkz.moon_star.dto.MenuDTO.Type;

public class NonvegFinderImpl implements Finder {

	@Override
	public boolean test(MenuDTO dto) {
		System.out.println("test method");
		if (dto != null && dto.getType().equals(Type.NONVEG)) {
			return true;
		}
		return false;
	}


}
