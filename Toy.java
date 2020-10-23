public class Toy{
	public static void main(String[] params){
		System.out.println("JVM invokes main method");
		Pubg.enimiesAhed();//Calling method of another class(ie.Pubg)
		System.out.println("End of main");
	}
}