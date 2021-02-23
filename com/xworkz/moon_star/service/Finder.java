package com.xworkz.moon_star.service;

import com.xworkz.moon_star.dto.MenuDTO;
@FunctionalInterface
public interface Finder {
	boolean test(MenuDTO dto);
}
