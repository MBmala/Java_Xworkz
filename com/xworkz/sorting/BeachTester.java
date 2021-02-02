package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.sorting.dto.BeachDTO;
import com.xworkz.sorting.sort.BeachNoOfResortsComparator;

public class BeachTester {
	public static void main(String[] args) {

		BeachDTO beach1 = new BeachDTO("Om", 43, 3);

		BeachDTO beach2 = new BeachDTO("Maple", 4, 56);

		BeachDTO beach3 = new BeachDTO("Marina", 70, 32);

		BeachDTO beach4 = new BeachDTO("Juhu", 7, 7);

		List<BeachDTO> beachDTOs = new ArrayList<BeachDTO>();
		beachDTOs.add(beach1);
		beachDTOs.add(beach2);
		beachDTOs.add(beach3);
		beachDTOs.add(beach4);
		
		//Comparable
		Collections.sort(beachDTOs);// it calls compareTo()

		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}

		System.out.println("--------------------------------------------------");
		//Comparator
		BeachNoOfResortsComparator comparator = new BeachNoOfResortsComparator();
		Collections.sort(beachDTOs,comparator);//it calls compare()
		
		System.out.println("After Sorting ");

		for (BeachDTO beachDTO : beachDTOs) {
			System.out.println(beachDTO);
		}
	}

}
