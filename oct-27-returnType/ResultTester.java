public class ResultTester{
	public static void main(String[] args){
		System.out.println("JVM invoked main");
		double percent=88.80;
		String value=Result.report(percent);
		System.out.println("Result:"+value);
		System.out.println("end of main");
	}
}