public class Government{	
	public static void main(String[] politicians)
	{
		System.out.println("JVM invokes main");		
		String[] ministersArray={"BSY",
		"HDK",
		"Siddaramiah",
		"Jagadish Shettar",
		"SM Krishna"};
		chiefMinisters(ministersArray);	//for array we must pass ref_variable as argument.

		chiefMinisters(null);		
		System.out.println("end of main");
	}		
	public static void chiefMinisters(String[] names)
	{
		
		System.out.println("cheifMinisters "+names );	//it won't print array elements. 	
		int size=names.length;
		System.out.println("size of array"+size);
		System.out.println("Chief Minister @ index 0 "+names[0]);
		System.out.println("Chief Minister @ index 3 "+names[3]);
		System.out.println("Chief Minister @ index 8 "+names[8]);//exception error
	}
}