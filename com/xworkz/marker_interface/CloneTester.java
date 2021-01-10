package com.xworkz.marker_interface;

import com.xworkz.marker_interface.dto.MobilePhoneBookDTO;
import com.xworkz.marker_interface.dto.PhoneBookDTO;

public class CloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		PhoneBookDTO bookDTO = new PhoneBookDTO();
		bookDTO.setName("mala");
		bookDTO.setPincode("582116");
		bookDTO.setPhoneNo(7829446970L);
		System.out.println(bookDTO.getName());
		System.out.println(bookDTO.getPincode());
		System.out.println(bookDTO.getPhoneNo());

		PhoneBookDTO copyOfPhoneBook = bookDTO.clone();//copy of the object with same data as bookDTO
		System.out.println(copyOfPhoneBook.getName() + " " + copyOfPhoneBook.getPhoneNo() + " " + copyOfPhoneBook.getPincode());
		// below not imp
		Object object = (Object) bookDTO;

		MobilePhoneBookDTO child=(MobilePhoneBookDTO)bookDTO;

		Object name = "X-workz";
		PhoneBookDTO dto = (PhoneBookDTO) name;//it works bcz everyclass has Object Parent class
	}
}