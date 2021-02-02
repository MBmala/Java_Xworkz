package com.xworkz.license.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;
import com.xworkz.license.constants.VehicleType;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();// Initializing instance var in constructor
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo: " + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			// String idProofFromDTO = licenseDTO.getIdProofNo();
			// if (idProofFromDTO.equals(idProofNo))
			if (licenseDTO.getIdProofNo().equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;

	}

	@Override
	public boolean deleteByIdProofNo(String idProof) {
		System.out.println("invoked deleteByIdProofNo");
		System.out.println("idProof:" + idProof);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can delete , license is found");
			this.database.remove(dtoFromDB);
			return true;
		} else {
			System.out.println("cannot delete , license not found");
		}
		return false;
	}

	/*it also works as same above
	 * 
	 * public boolean deleteByIdProofNo(String idProof) {
	 * System.out.println("invoked deleteByIdProofNo");
	 * System.out.println("idProof:" + idProof); ListIterator<LicenseDTO> iterator =
	 * database.listIterator(); while (iterator.hasNext()) { LicenseDTO licenseDTO =
	 * iterator.next(); if (licenseDTO.getIdProofNo().equals(idProof)) {
	 * iterator.remove(); System.out.println("successfully deleted"); return true;
	 * 
	 * } else { System.out.println("not able to delete"); } }
	 * 
	 * return false; }
	 */

}
