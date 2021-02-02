package com.xworkz.license.dao;

import com.xworkz.license.dto.LicenseDTO;
import com.xworkz.license.constants.VehicleType;
 

public interface LicenseDAO {
	void save(LicenseDTO dto);

	LicenseDTO findByIdProofNo(String idProofNo);

	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);

	boolean deleteByIdProofNo(String idPrrof);

}
