package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		System.out.println("Created ResortDAOImpl");
		this.resortList = resortDTOs;
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save in dao");
		boolean added = this.resortList.add(dto);
		System.out.println("added " + added);
		return added;
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println(" invoked updateLocationByName");
		for (ResortDTO resortDTO : this.resortList) {
			if (resortDTO.getName().equals(name)) {
				System.out.println("we can update location for " + name + " resort");
				resortDTO.setLocation(location);
				System.out.println("updated location for" + name + " resort " + resortDTO);
				return true;

			} else {
				System.out.println("can't update location");
			}
		}

		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, float rating) {
		System.out.println(" invoked updateLocationByNameandRating");
		for (ResortDTO resortDTO : this.resortList) {
			if (resortDTO.getName().equals(name) && resortDTO.getRating() == rating) {
				System.out.println("we can update location for " + name + " resort");
				resortDTO.setLocation(location);
				System.out.println("updated location for " + name + " resort " + resortDTO);
				return true;

			} else {
				System.out.println("can't update location");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println(" invoked deleteByNameAndLocation");
		for (ResortDTO resortDTO : this.resortList) {
			if (resortDTO.getName().equals(name) && resortDTO.getLocation().equals(location)) {

				this.resortList.remove(resortDTO);
				System.out.println(name + "resort is removed");
				return true;

			} else {
				System.out.println("can't delete resort");
			}
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {
		if(dtos!=null) {
			boolean added=this.resortList.addAll(dtos);
			System.out.println("multiple resort added "+added);
			System.out.println(this.resortList);
			return true;
		}
		return false;
	}

	@Override
	public int totalResortSize() {
		return this.resortList.size();
	}

	@Override
	public List<ResortDTO> getAll() {
		System.out.println("invoked getAll");
		System.out.println("resorts are");
		return this.resortList;
	}
}
