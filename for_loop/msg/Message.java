public class Message{
	public static void printMessage()
	{		
		for(byte msg=0;msg<=2;msg++)
		{
		System.out.println("Try again");
		}						
	}
	
	public static void printMessage(int loopSize)
	{
		for(int msg=0;msg<=loopSize;msg++)
		{
		System.out.println("Shaping the future" + msg);
		}						
	}
	
	public static void groupMessagesAndLoop()
	{
		System.out.println("invoked groupMessagesAndLoop");
		String[] messages={"Good Morning","Updates are available","memory is full","shut down the system","Battery is full"};
		System.out.println(" Number of messages are:"+messages.length);
		
		for(int count=0;count<messages.length;count++)
		{
			System.out.println("count "+count);
			String message=messages[count];
			System.out.println("message "+ message);
		}	
	}	
}