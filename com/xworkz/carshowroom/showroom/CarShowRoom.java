package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] carDTO = new CarDTO[10];
	private int currentIndex = 0;

	public CarShowRoom() {

	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
		} else {
			System.out.println("Add valid manager details");

		}
	}

	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
		} else {
			System.out.println("Add valid manager details");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager is not there");
		}
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0 && this.managerDTO != null) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println("updated contact no" + this.managerDTO.getContactNo());
		} else {
			System.out.println("give correct contact number");
		}
	}

	public void updateManager(String name) {
		if (name != null && this.managerDTO != null) {
			this.managerDTO.setName(name);
			System.out.println("details are valid, updated name");
		} else {
			System.out.println("cannot update name,data is invalid");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}

	public void addCar(CarDTO dto) {
		if (dto != null && this.currentIndex < 10) {
			System.out.println("current index value:" + this.currentIndex);
			this.carDTO[currentIndex] = dto;
			this.currentIndex++;
		} else {
			System.out.println("we can't add car ");
		}

	}

	public void displayCars() {
		// CarDTO[] tempCars=this.carDTO;
		// for (int i = 0; i < tempCars.length; i++)
		System.out.println("cars list");
		for (int i = 0; i < this.carDTO.length; i++) {
			CarDTO dto = this.carDTO[i];
			if (dto != null) {
				System.out.println((i + 1) + "] model:" + dto.getModel());
				System.out.println("price:" + dto.getPrice());
				System.out.println("car variant:" + dto.getCarveriant());
			}
		}

	}

	public void updateCarVariant(CarVariant newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 10) {
			System.out.println("car is found at index " + indexToUpdate);
			System.out.println("updating variant " + newVariant);
			CarDTO dto1 = this.carDTO[indexToUpdate];
			dto1.setCarveriant(newVariant);

		}
	}

	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 10) {
			System.out.println("Display car at index: " + indexToDisplay);
			CarDTO dto2 = this.carDTO[indexToDisplay];
			if (dto2 != null) {
				System.out.println(dto2.getModel());
				System.out.println(dto2.getPrice());
				System.out.println(dto2.getCarveriant());
			}
		}
	}

	public void displayCarByModel(String model) {
		if (model != null) {
			System.out.println("information of car " + model);
			boolean carFound = false;
			for (int i = 0; i < this.carDTO.length; i++) {
				CarDTO refDTO = this.carDTO[i];
				String localModel = refDTO.getModel();
				if (localModel.equals(model)) {
					System.out.println("car is found");
					System.out.println("car:" + refDTO.getModel());
					System.out.println("price:" + refDTO.getPrice());
					System.out.println("variant:" + refDTO.getCarveriant());
					carFound = true;
					break;
				}
			}
			if (carFound == false) {
				System.out.println("car is not found");
			}
		}
	}

	public void deleteCarByIndex(int index) {
		if (index >= 0 && index < 10) {
			System.out.println("index is valid");
			this.carDTO[index] = null;
		} else {
			System.out.println("index is invalid,car can't be deleted");
		}
	}

	/**
	 * 
	 * @param model
	 */
	public void deleteCarByModel(String model) {
		if (model != null) {
			boolean carFound = false;
			for (int i = 0; i < this.carDTO.length; i++) {
				CarDTO dto = carDTO[i];
				String localModel = dto.getModel();
				if (localModel.equals(model)) {
					this.carDTO[i] = null;
					System.out.println("car is deleted");
					carFound = true;
					break;
				}
			}
			if (carFound == false) {
				System.out.println("car cannot be deleted");
			}
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public ManagerDTO getManagerDTO() {
		return managerDTO;
	}

	public CarDTO[] getCarDTO() {
		return carDTO;
	}

}