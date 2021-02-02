package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTester {

	
//Simple string sorting in list
	public static void main(String[] args) {
		List<String> garageToolList=new ArrayList();
		garageToolList.add("spanner");
		garageToolList.add("screw Driver");
		garageToolList.add("cutting plier");
		garageToolList.add("hammer");
		garageToolList.add("nut");
		garageToolList.add("bolt");
		garageToolList.add("jack");
		garageToolList.add("air pump");
		garageToolList.add("gun");
		garageToolList.add("mechanic");
		
		
		//Collections is a utility class 
		Collections.sort(garageToolList);
		
		for (String toolSorted : garageToolList) {
			System.out.println(toolSorted);
		}
		

	}

}
