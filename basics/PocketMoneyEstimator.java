package com.xworkz.basics;

public class PocketMoneyEstimator {
	
	private static double totalAmount;
	
	public static double getTotalAmount() {
		return totalAmount;
	}
	
	public static void request(int amount,String day) {
		System.out.println("amount requested:"+amount);
		System.out.println("requested day:"+day);
		totalAmount=totalAmount+amount;
		//System.out.println(totalAmount);
	}
	
	public static void expenditure(int amount) {
		if(amount<1000) {
		System.out.println("amount expended:"+amount);
		totalAmount=totalAmount-amount;
		//System.out.println("remaining amout:"+totalAmount);
		}
		else {
			System.out.println("expenditure should be below 1000Rs");
		}
	}

}
