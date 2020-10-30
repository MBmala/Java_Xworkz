public class RankTester{
	public static void main(String[] args){
		System.out.println("JVM invoked main");
	
	        String percent=args[0];//runtime args
	        double res=Double.parseDouble(percent);//converting string to double type
	        String value=Rank.report(res);//calling method
			System.out.println("Result:"+value);//printing return value from method
	
	    System.out.println("EXIT :: main");
	}
}