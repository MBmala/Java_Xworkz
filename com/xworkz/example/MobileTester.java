package com.xworkz.example;

import com.xworkz.example.dto.MobileDTO;

public class MobileTester {

	public static void main(String[] args) {
		MobileDTO mobileDTO = new MobileDTO();
		mobileDTO.setName("oppo a53");
		mobileDTO.setColor("electric black");
		mobileDTO.setRam(4);
		mobileDTO.setMemory(64);
		mobileDTO.setBattery(5000);
		mobileDTO.setOs("Android10 color os");
		mobileDTO.setCamera("16px tripple camera");
		mobileDTO.setSize(5.6f);
		System.out.println(mobileDTO.getName());
		System.out.println(mobileDTO.getColor());
		System.out.println(mobileDTO.getRam());
		System.out.println(mobileDTO.getMemory());
		System.out.println(mobileDTO.getBattery());
		System.out.println(mobileDTO.getOs());
		System.out.println(mobileDTO.getCamera());
		System.out.println(mobileDTO.getSize());

		System.out.println("***********************************");
		MobileDTO mobileDTO1 = new MobileDTO("MI A3", "blue", 6, 128, "46mpx AI camera");
		System.out.println(mobileDTO1.getName());
		System.out.println(mobileDTO1.getColor());
		System.out.println(mobileDTO1.getRam());
		System.out.println(mobileDTO1.getMemory());
		System.out.println(mobileDTO1.getCamera());

	}

}
