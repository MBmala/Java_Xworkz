package com.xworkz.example;

import java.util.Date;

import com.xworkz.example.dto.FileDTO;

public class FileDataTester {
	public static void main(String[] args) {

		FileDTO dto = new FileDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());
		System.out.println("---------------------------------------------------");
		dto = new FileDTO("backup.jpg", 159.67);
		System.out.println(dto.getName());
		System.out.println(dto.getSize());
		System.out.println(dto.getCreatedDate());
		Date currentDate = new Date();
		//System.out.println(currentDate);to print directly
		dto.setCreatedDate(currentDate);
		System.out.println(dto.getCreatedDate());
		dto.setLocation("C://images");
		dto.setType("jpg");
		System.out.println("---------------------------------------------------");
		Date date = new Date();
		FileDTO dto2 = new FileDTO("xworkz.jpg", 100, "jpg", "C://images", date);
		System.out.println(dto2.getName());
		System.out.println(dto2.getSize());
		System.out.println(dto2.getType());
		System.out.println(dto2.getLocation());
		System.out.println(dto2.getCreatedDate());

	}

}
