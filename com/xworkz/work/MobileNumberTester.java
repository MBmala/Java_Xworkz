package com.xworkz.work;

import java.util.ArrayList;
import java.util.Collection;

public class MobileNumberTester {

	public static void main(String[] args) {

		Collection<Long> mobileNumbers = new ArrayList();
		mobileNumbers.add(9876543210l);
		mobileNumbers.add(9481067554l);
		mobileNumbers.add(9481067552l);
		mobileNumbers.add(9481067559l);

		for (Long mobileNo : mobileNumbers) {

			String convertedMobileNo = mobileNo.toString();
			Character last = convertedMobileNo.charAt(convertedMobileNo.length() - 1);
			System.out.println(last);
			if (Integer.parseInt(last.toString()) > 3) {
				System.out.println("mobile number is greater" + convertedMobileNo);
			}
		}

	}

}
