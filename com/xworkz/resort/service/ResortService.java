package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {
	void validateAndSave(ResortDTO dto);

	boolean updateLocationByName(String location, String name);

	boolean updateLocationByNameandRating(String location, String name, float rating);

	boolean deleteByNameAndLocation(String name, String location);

	boolean addMultipleResorts(List<ResortDTO> dtos);

	int totalResortSize();

	List<ResortDTO> getAll();


}
