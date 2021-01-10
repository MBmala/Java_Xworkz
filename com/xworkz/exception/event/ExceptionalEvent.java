package com.xworkz.exception.event;

public class ExceptionalEvent {

	public ExceptionalEvent() {
		System.out.println("Created ExceptionalEvent");
	}

	public void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("invoked createExceptionalEvent");
		if (create) {
			System.out.println("creating exceptional event");
			Throwable throwable = new Throwable();//from java.lang package
			throw throwable;
		} else {
			System.out.println("no exceptional event");
		}
	}

	public void frame1() throws Throwable {
		this.frame2();
	}

	public void frame2() throws Throwable {
		this.frame3();
	}

	public void frame3() throws Throwable {
		this.frame4();
	}

	public void frame4() throws Throwable {
		this.frame5();
	}

	public void frame5() throws Throwable {
		this.createExceptionalEvent(true);

	}//it shows exception in reverse order frame5-frame1,main() then pgm will terminate

}