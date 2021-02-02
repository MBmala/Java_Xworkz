package com.xworkz.resort.service;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {
	String specialChar = "^[^<>'\"/;`%]*$";
	private ResortDAO dao;

	public ResortServiceImpl(ResortDAO dao) {
		this.dao = dao;
	}

	@Override
	public void validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");
		// System.out.println("arg1 " + dto);
		boolean valid = false;
		if (dto != null) {
			System.out.println("dto is not null,can save fields");
			String location = dto.getLocation();
			if (location != null && location.length() >= 3 && location.length() <= 20 && !location.isEmpty()
					&& !location.contains(" ") && !location.contains(specialChar)) {
				System.out.println("location is valid");
				valid = true;
			} else {
				System.out.println("location is not valid");
				valid = false;
			}

			if (valid) {
				String tempName = dto.getName();
				if (tempName != null && tempName.length() >= 3 && tempName.length() <= 15 && !tempName.isEmpty()
						&& !tempName.contains(" ")) {
					System.out.println("name is valid");
					valid = true;
				} else {
					System.out.println("name is invalid");
					valid = false;
				}
			}

			if (valid) {
				double pricePerHead = dto.getPricePerHead();
				if (pricePerHead >= 999 && pricePerHead <= 2500) {
					System.out.println("pricePerHead is valid");
					valid = true;
				} else {
					System.out.println("pricePerHead is invalid");
					valid = false;
				}
			}

			if (valid) {
				float rating = dto.getRating();
				if (rating >= 0 && rating <= 5) {
					System.out.println("rating is valid");
					valid = true;
				} else {
					System.out.println("rating is invalid");
					valid = false;
				}
			}

			if (valid) {
				long phoneNumber = dto.getPhoneNo();
				int count = 0;
				while (phoneNumber > 0) {
					phoneNumber = phoneNumber / 10;
					count++;
				}
				if (count == 10) {
					System.out.println("phone number is valid");
					valid = true;
				} else {
					System.out.println("phone number is invalid");
					valid = false;
				}
			}

			if (valid) {
				String managerName = dto.getManagerName();
				if (managerName != null && managerName.length() >= 3 && managerName.length() <= 12
						&& !managerName.isEmpty() && !managerName.contains(" ")) {
					System.out.println("manager name is valid");
					valid = true;
				} else {
					System.out.println("manager name is invalid");
					valid = false;
				}
			}
			if (valid) {
				int numberOfEmployee = dto.getNoOfEmployees();
				if (numberOfEmployee >= 5 && numberOfEmployee <= 25) {
					System.out.println("number of employee is valid");
					valid = true;
				} else {
					System.out.println("number of employee is invalid");
					valid = false;
				}
			}
			if (valid) {
				boolean poolExist = dto.isPoolExist();
				if (poolExist == true) {
					System.out.println("pool exist ");
					valid = true;
				} else {
					System.out.println("pool not exist");
					valid = true;
				}
			}
			if (valid) {
				System.out.println("dto is valid, can save");
				// ResortDAO dao=new ResortDAOImpl(new ArrayList<ResortDTO>()); tight coupling
				this.dao.save(dto);
			} else {
				System.out.println("dto is invalid , cannot save");
			}
		} else {
			System.out.println("dto is null");
		}
	}

	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("invoked updateLocationByName");
		boolean valid = false;
		if (location != null && location.length() >= 3 && location.length() <= 20 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			System.out.println("location is valid");
			valid = true;
		} else {
			System.out.println("location is not valid");
			valid = false;
		}
		if (valid) {
			if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.out.println("name is invalid");
				valid = false;
			}
		}
		if (valid) {
			System.out.println("location & name is valid,we can update");
			this.dao.updateLocationByName(location, name);
		} else {
			System.out.println("name and location are not valid");
		}
		return false;
	}

	@Override
	public boolean updateLocationByNameandRating(String location, String name, float rating) {
		System.out.println("invoked validateAndUpdateLocationByNameandRating");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar) && rating >= 0 && rating <= 5) {
			this.dao.updateLocationByNameandRating(location, name, rating);
			return true;
		}
		return false;

	}

	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("invoked validatAndDeleteByNameAndLocation");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& location != null && location.length() >= 3 && location.length() <= 15 && !location.isEmpty()
				&& !location.contains(" ") && !location.contains(specialChar)) {
			this.dao.deleteByNameAndLocation(name, location);
			return true;
		} else {
			System.out.println("name and location are not valid");
		}
		return false;
	}

	@Override
	public boolean addMultipleResorts(List<ResortDTO> dtos) {

		System.out.println("invoked validateAddMultipleResorts");
		boolean valid = false;
		if (dtos != null && dtos.size() > 0) {
			int size = dtos.size();
			int tempSize = 0;
			boolean saved = dao.addMultipleResorts(dtos);
			if (!saved) {
				System.out.println("dto not saved");
				valid = false;
			} else {
				System.out.println("dto saved");
				tempSize++;
			}
			if (tempSize == size) {
				valid = true;
			}
		}
		return valid;
	}

	@Override
	public int totalResortSize() {

		return this.dao.totalResortSize();
	}

	@Override
	public List<ResortDTO> getAll() {

		return this.dao.getAll();
	}

}
