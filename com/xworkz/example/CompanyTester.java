package com.xworkz.example;

import com.xworkz.example.dto.CompanyDTO;

public class CompanyTester {

	public static void main(String[] args) {
		CompanyDTO companyDTO = new CompanyDTO();
		companyDTO.setName("Amazon");
		companyDTO.setLocation("Washington");
		System.out.println(companyDTO.getName());
		System.out.println(companyDTO.getLocation());

		CompanyDTO companyDTO1 = new CompanyDTO();
		companyDTO1.setName("X-workz");
		companyDTO1.setLocation("Bangalore");
		companyDTO1.setType("traing institute");
		companyDTO1.setManager("Omkar");
		companyDTO1.setWebsite("www.x-workz.in");
		companyDTO1.setNoOfEmployees(15);
		System.out.println(companyDTO1.getName());
		System.out.println(companyDTO1.getLocation());
		System.out.println(companyDTO1.getType());
		System.out.println(companyDTO1.getManager());
		System.out.println(companyDTO1.getWebsite());
		System.out.println(companyDTO1.getNoOfEmployees());

	}

}
