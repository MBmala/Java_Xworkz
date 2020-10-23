public class Accessories{
		
	public static void main(String[] accessories)
	{
		
		System.out.println("JVM invoked main");	
        String item="Charger";		
	  
		laptopAccessories("mouse");		
		laptopAccessories(null);			
		laptopAccessories(item);
		
		System.out.println("main method exit");
	}
	
	
	public static void laptopAccessories(String name)
	{
		System.out.println("invoked laptopAccessories " +name);
		
	}
	
	
}