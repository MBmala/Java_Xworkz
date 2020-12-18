package com.xworkz.coffee_day;

import com.xworkz.coffee_day.applicance.CoffeeMachine;
import com.xworkz.coffee_day.applicance.Power;

public class CoffeeMachineTester {

	public static void main(String[] args) {
		// Power power=new Power();
		CoffeeMachine machine = new CoffeeMachine(new Power());

		boolean success = machine.grind("Civet");
		if (success) {
			System.out.println("I know grinding was done");

		} else {
			System.out.println("Griding not done");

		}
	}
}
