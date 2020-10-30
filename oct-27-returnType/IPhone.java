public class IPhone{
	public static boolean call()
	{
	    System.out.println("invoked call");
		boolean connected=false;
		return connected;
	}
	
	public static String message()
	{
		System.out.println("invoked message");
		String msg="Hi folks";
		return msg;
	}
	
	public static byte charging(double volts)
	{
		
		System.out.println("invoked charging");
		System.out.println("Volts : "+volts);
		if(volts>3){
			//local compiler cannot see inside this
			System.out.println("volts is greater than 3");
			return 100;
		}
		if(volts<3 && volts>0){ 
			//local compiler cannot see inside this
			System.out.println("volts is lesser than 3");
			return 0;
		}
		return -1;
	}	
}