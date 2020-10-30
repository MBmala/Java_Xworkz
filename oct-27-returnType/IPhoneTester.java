public class IPhoneTester{


    public static void main(String[] models)
	{
		System.out.println("JVM invoked main ");		
		IPhone.call();
		System.out.println("return value from call():");
		  
		String sandesha=IPhone.message();
		  //calling method and storing the return value from the method
		System.out.println("return value from message(): "+ sandesha);
		  
		byte chargeValue=IPhone.charging(5);
		System.out.println("return value from charging():"+chargeValue);
		
		System.out.println("EXIT:: main");	
	}
}