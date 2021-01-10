package com.xworkz.object_methods.dto;


public class PoliceStationDTO  extends Object {

	private String area;
	private int noOfCells;
	private String name;

	public PoliceStationDTO() {
		System.out.println("Created PoliceStationDTO");
	}

	/**
	 * @param area
	 * @param noOfCells
	 * @param name
	 */
	public PoliceStationDTO(String area, int noOfCells, String name) {
		super();
		this.area = area;
		this.noOfCells = noOfCells;
		this.name = name;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [area=" + area + ", noOfCells=" + noOfCells + ", name=" + name + "]";
	}
/**
 * equals() checks 2 ref pointing to same object
 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj == this) {// Ex:dto1.equals(dto2) ==>if obj(dto2) and the current instance(dto1) pointing to same object
				System.out.println("obj pointing to same memory");
				return true;
			} else {
				if (obj instanceof PoliceStationDTO) {
					PoliceStationDTO casted = (PoliceStationDTO) obj;
					if (casted.getName() != null && casted.getName().equals(this.name)) {
						System.out.println("name is equal");
						return true;
					} else {
						System.out.println("name is not equal");
					}
				}
			}
		}
		System.out.println("obj is not equal");
		return false;
	}
	
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 45;//some value just for reference
	}

	public String getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

}
