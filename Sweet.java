public class Sweet{
	public static void main(String[] names){
		
		int size=names.length;
		System.out .println("Total elements: "+size);
		
		Flavor.taste(names[0]);
		Flavor.taste(names[1]);
		//Flavor.taste(names[2]);
	}
}