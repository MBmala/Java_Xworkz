public class MessageTester{
    public static void main(String[] msgs)
	{
		System.out.println("JVM invoked main");
        Message.printMessage();
		
	    String valueAtIndex0=msgs[0];	
        int number=Integer.parseInt(valueAtIndex0);
	    Message.printMessage(number);//number is runtime argument

	    Message.groupMessagesAndLoop();
	    System.out.println("EXIT :: main");	
	}
}