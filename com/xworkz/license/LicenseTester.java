package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {
	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(1325, "hubli road", 582116, "basthibana", "laxmeshwar", "Karnatak",
				"8d35");

		Date dob = new Date();// 16/10/1997
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob = format.parse("20/10/1998");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LicenseDTO dto = new LicenseDTO("mala", 23, addressDTO, dob, 7829446971L, BloodGroup.O_POSITIVE, Gender.FEMALE);
		dto.setIdProof(IdProof.ADHAR);

		dto.setIdProofNo("9519 7428 1788");
		dto.setCommercial(false);
		dto.setDisablity(false);
		dto.setStartdate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELER);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(dto);// DAO adding data
		// CRUD----
		LicenseDTO dtoFound = dao.findByIdProofNo("9519 7428 1788");
		System.out.println(dtoFound);

		boolean updated = dao.updateVehicleTypeByIdProofNo("9519 7428 1788", VehicleType.LMV);
		System.out.println("updated " + updated);

		LicenseDTO dtoafterUpdate = dao.findByIdProofNo("9519 7428 1788");
		System.out.println(dtoafterUpdate);
		
		boolean deleted = dao.deleteByIdProofNo("9519 7428 1788");
		System.out.println("deleted " + deleted);
	   // deleted = dao.deleteByIdProofNo("9519 7425 1788");
		//System.out.println("deleted " + deleted);

	}

}
