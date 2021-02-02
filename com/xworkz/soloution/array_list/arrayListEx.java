package com.xworkz.soloution.array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arrayListEx {
	public static void main(String[] args) {
		
		String cadbury="dairy milk";
		String nestle="kitkat";
		String parle="kissme";
		String amul="Dark chocalate";
		Collection chocalates=new ArrayList();
		
		chocalates.add(cadbury);
		chocalates.add(nestle);
		chocalates.add(parle);
		chocalates.add(amul);
		 int totalElement=chocalates.size();
		 System.out.println(totalElement);
		
		
		List chocalate=new ArrayList();
	}

}
