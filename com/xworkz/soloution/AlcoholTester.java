package com.xworkz.soloution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.xworkz.soloution.dto.AlcoholDTO;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO alcoholDTO1 = new AlcoholDTO("IB", "Imperial", 48);

		AlcoholDTO alcoholDTO2 = new AlcoholDTO("Amstel", "King Fisher", 4);

		AlcoholDTO alcoholDTO3 = new AlcoholDTO("Magic Moments", "NA", 38);

		AlcoholDTO alcoholDTO4 = new AlcoholDTO("Old Monk", "NA", 42);
		
		//List<AlcoholDTO> alcoholDTOs = new ArrayList<AlcoholDTO>
		List<AlcoholDTO> alcoholDTOs = new ArrayList<AlcoholDTO>(100);//100 is size
		alcoholDTOs.add(alcoholDTO4);
		alcoholDTOs.add(1, alcoholDTO2);
		alcoholDTOs.add(2,alcoholDTO3);
		alcoholDTOs.add(3,alcoholDTO1);
		

		// alcoholDTOs.remove(alcoholDTO3); obj ref
		// alcoholDTOs.remove(2); index

		AlcoholDTO alcoholDTO5 = new AlcoholDTO("Bud Wiser", "King Fisher", 8);
		AlcoholDTO alcoholDTO6 = new AlcoholDTO("wine", "NA", 1);
		alcoholDTOs.add(4, alcoholDTO5);

		int index = alcoholDTOs.indexOf(alcoholDTO5);//indexOf it search obj from top to bottom in list
		System.out.println("indexOf" + index);

		int lastIndex = alcoholDTOs.lastIndexOf(alcoholDTO3);//lastIndexOf it search obj from bottom to top
		System.out.println("lastIndex" + lastIndex);
		for (AlcoholDTO alcoholDTO : alcoholDTOs) {
			System.out.println(alcoholDTO);//toString()
		}
		System.out.println("*******************************");
		alcoholDTOs.set(1,alcoholDTO6);//it replaces
		for (AlcoholDTO alcoholDTO : alcoholDTOs) {
			System.out.println(alcoholDTO);//toString()
		}
	}

}
