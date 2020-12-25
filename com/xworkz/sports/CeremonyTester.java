package com.xworkz.sports;

import com.xworkz.sports.award.Ceremony;

public class CeremonyTester {

	public static void main(String[] args) {

		Ceremony ceremony = new Ceremony("Agadi Fest");

		String[] foodItems = { "Jamoon", "Kaju Barfi", "parata", "curry", "Fried Rice", "Mysore Pak", "ice cream" };

		ceremony.setFoods(foodItems);

		ceremony.distributeAward("Nikita", "Oscar");

		// ceremony.displayFoods();
		ceremony.displayCeremoryNameAndFoods();

		ceremony.accessParentMembers();

		int code = ceremony.hashCode();
		System.out.println(code);

	}

}
