package com.xworkz.basics;

public class PocketMoneyTester {

	public static void main(String[] args) {
		String day=args[1];
		int reqMoney=Integer.parseInt(args[0]);
		int expendMoney=Integer.parseInt(args[2]);
		
		PocketMoneyEstimator.request(reqMoney,day);
		
		PocketMoneyEstimator.expenditure(expendMoney);
		
		double totalMoney=PocketMoneyEstimator.getTotalAmount();
		System.out.println("Total money:"+totalMoney);

	}

}
