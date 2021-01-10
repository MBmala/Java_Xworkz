package com.xworkz.vtu;

import com.xworkz.vtu.exam.Exam;
import com.xworkz.vtu.exam.HallTicket;
import com.xworkz.vtu.exam.SupplementaryExam;

public class ExamTester {

	public static void main(String[] args) {

		Exam exam = new Exam();
		System.out.println(Exam.getUniversityName());//static member can be access using classnane or ref
		exam.setCode("15CS81");
		exam.setFees(1400);

		HallTicket hallTicket = new HallTicket("2ka16cs014", 8, "mala");

		boolean allowed = exam.allow(hallTicket);
		if (allowed) {
			System.out.println("can write exam");
		} else {
			System.out.println("cannot write exam");
		}

		SupplementaryExam supplementaryExam = new SupplementaryExam();
		//it takes value from type SupplementaryExam
		System.out.println(SupplementaryExam.getUniversityName());//using class
		//System.out.println(supplementaryExam.getUniversityName());//using ref
		
		System.out.println("************************************************");
		Exam supplementaryExam1 = new SupplementaryExam();
		//it takes value from type Exam
		System.out.println(supplementaryExam1.getUniversityName());

		

	}

}