package com.xworkz.exception;

import com.xworkz.exception.event.ExceptionalEvent;

public class EventTester {

	public static void main(String[] args)throws Throwable {

		
		ExceptionalEvent event=new ExceptionalEvent();
		
		//event.createExceptionalEvent(true);
		event.frame1();
		
	}

}