package com.xworkz.vtu.exam;

public class HallTicket {

	private String ticketNo;
	private int noOfSubjects;
	private String studentName;

	/**
	 * @param ticketNo
	 * @param noOfSubjects
	 * @param studentName
	 */
	public HallTicket(String ticketNo, int noOfSubjects, String studentName) {
		super();
		this.ticketNo = ticketNo;
		this.noOfSubjects = noOfSubjects;
		this.studentName = studentName;
	}

	public void displayDetails() {
		System.out.println("invoked displayDetails");
		System.out.println(ticketNo);
		System.out.println(noOfSubjects);
		System.out.println(studentName);
	}

}