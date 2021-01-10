package com.xworkz.object_methods.dto;

public class RailwatStationDTO extends PoliceStationDTO{
	
	public RailwatStationDTO(String area, int noOfCells, String name) {
		super(area,noOfCells,name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 46;
	}
}
