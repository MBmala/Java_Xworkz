package com.xworkz.basics;

public class CreditCardEstimater {
	private static double limit=1000;
	private static double totalAmount=20000;
	
	public static void expenditure(double amount) {
		System.out.println("total amount in credit card is "+limit);
		if(amount<limit) {
		totalAmount=totalAmount-amount;
		System.out.println("expenditure is "+amount);
		System.out.println("remaining amount is "+totalAmount);
	    }
		else {
			System.out.println("expenditure must be less than "+limt);
		}
	}
	
}