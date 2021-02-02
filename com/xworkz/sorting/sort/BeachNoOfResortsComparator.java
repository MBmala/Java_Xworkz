package com.xworkz.sorting.sort;

import java.util.Comparator;

import com.xworkz.sorting.dto.BeachDTO;

public class BeachNoOfResortsComparator implements Comparator<BeachDTO> {

	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		Integer o1No = o1.getNoOfResorts();//boxing
		Integer o2No = o2.getNoOfResorts();
		//return o2No.compareTo(o1No);//dsc
		return o1No.compareTo(o2No);//asc
	}

}
