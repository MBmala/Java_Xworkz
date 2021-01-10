package com.xworkz.vtu.exam;

public class SupplementaryExam extends Exam {

	public static String universityName = "VTU MANGALORE";

	// <init>
	public SupplementaryExam() {

		System.out.println("invoked SupplementaryExam const");
	}

	public SupplementaryExam(String name) {
		System.out.println("calling over loaded const suppl");
	}

	@Override
	public void testOverride(String name, int age, double fees, double take, String email, int a, char d, char e) {
		super.testOverride(name, age, fees, take, email, a, d, e);
	}

	@Override // annotations
	public boolean allow(HallTicket hallTicket) {
		System.out.println("invoked allow from SupplementaryExam");
		return super.allow(hallTicket);
	}

	public static String getUniversityName() {
		return universityName;
	}
}