package com.xworkz.moon_star;

import java.util.Collections;

import com.xworkz.moon_star.dto.MenuDTO;
import com.xworkz.moon_star.dto.MenuDTO.Type;
import com.xworkz.moon_star.service.Finder;
import com.xworkz.moon_star.service.NonvegFinderImpl;
import com.xworkz.moon_star.service.RestaurantService;
import com.xworkz.moon_star.service.RestaurantServiceImpl;

public class Tester {

public static void main(String[] args) {
	RestaurantService restaurantService = new RestaurantServiceImpl();

	// restaurantService.displayItemGreaterThan(200);
	//restaurantService.displayByName("Ghee Rice");
	
	 /*     for non-veg
	  * Finder finder=new NonvegFinderImpl(); 
	  * restaurantService.findAndDisplay(finder);
	  *      for veg
	 * finder=new VegFinderImpl();
	 * restaurantService.findAndDisplay(finder);
	 */
	
	

//Functional Interface is Finder
	restaurantService.findAndDisplay(new Finder() {
		//Anonymous class which don't have name and we instantiate the interface
		@Override
		public boolean test(MenuDTO dto) {
			if (dto.getPrice() < 200) {
				return true;
			}
			return false;
		}

	});
   //(ref)->{}; lamda expression
	//() is required if you have more than one param
	//more than one statement
	restaurantService.findAndDisplay(d->d.getPrice()>300);// here it internally calls test method
	

}

}
