package com.xworkz.example;

import com.xworkz.example.dto.CustomerDTO;

public class DtoTester {

	public static void main(String[] args) {
		CustomerDTO customerDto = new CustomerDTO();
		customerDto.setCustomerId(20);
		System.out.println(customerDto.getCustomerId());
		customerDto.setName("mala");
		System.out.println(customerDto.getName());
		customerDto.setContactNo(782944697l);
		System.out.println(customerDto.getContactNo());
		customerDto.setEmail("mala.xworkx@gmail.com");
		System.out.println(customerDto.getEmail());

		CustomerDTO customerDto1 = new CustomerDTO();
		customerDto1.setCustomerId(2548);
		System.out.println(customerDto1.getCustomerId());
		customerDto1.setName("omkar");
		System.out.println(customerDto1.getName());
		customerDto1.setContactNo(7225489762l);
		System.out.println(customerDto1.getContactNo());
		customerDto1.setEmail("omkarmb05@gmail.com");
		System.out.println(customerDto1.getEmail());

	}

}