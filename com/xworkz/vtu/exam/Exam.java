package com.xworkz.vtu.exam;

public class Exam {

	private String code;
	private double fees;
	private HallTicket hallTicket;
	public static String universityName = "VTU";

	public Exam(String code, double fees) {
		System.out.println("invoked Exam const");
		this.code = code;
		this.fees = fees;
	}

	public Exam() {
		System.out.println("Exam default const");
	}

	/**
	 * This method is only for fun, to understand over-riding annotation
	 * 
	 * @param hallTicket
	 * @return
	 */
	public void testOverride(String name, int age, double fees, double take, String email, int a, char d, char e) {

	}

	public boolean allow(HallTicket hallTicket) {
		System.out.println("invoked allow ");
		boolean there = false;
		if (this.fees >= 1000) {
			System.out.println("fees paid");
			if (hallTicket != null) {
				there = true;
				this.hallTicket = hallTicket;
				this.hallTicket.displayDetails();
				System.out.println("EXAM CODE : " + this.code);
			} else {
				System.out.println("no hall ticket");
			}
		} else {
			System.out.println("fees is less");

		}
		return there;
	}

	public static String getUniversityName() {
		return universityName;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
}
