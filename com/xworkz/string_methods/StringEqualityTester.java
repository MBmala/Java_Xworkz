package com.xworkz.string_methods;

public class StringEqualityTester {
	public static void main(String[] args) {

		// checking string literal equality
		String trainingCenter = "X-workz";
		String institute = "X-workz";
		String company = "x-workz";
		if (trainingCenter == institute) {
			System.out.println("Both reference pointing to same instance");
		} else {
			System.out.println("Both are not reference pointing to same instance/object");
		}

		if (trainingCenter == company) {
			System.out.println("Both reference pointing to same instance");
		} else {
			System.out.println("Both are not reference pointing to same instance/object");
		}

		boolean value = trainingCenter.equals(institute);
		System.out.println(value);
		// or
		if (trainingCenter.equals(company)) {
			System.out.println("Both reference having same content");
		} else {
			System.out.println("Both are not having same content");
		}
		// checking equality of ref_var of object
		StringEqualityTester equal = new StringEqualityTester();
		StringEqualityTester equals = new StringEqualityTester();
		StringEqualityTester equal1 = equal;

		if (equal == equals) {
			System.out.println("Both reference pointing to same instance");
		} else {
			System.out.println("Both are not reference pointing to same instance/object");
		}
		if (equal == equal1) {
			System.out.println("Both reference pointing to same instance");
		} else {
			System.out.println("Both are not reference pointing to same instance/object");
		}

		boolean ans = equal.equals(equal1);
		System.out.println(ans);

		ans = equal.equals(equals);
		System.out.println(ans);

	}

}
