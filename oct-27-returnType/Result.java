public class Result{
	public static String report(double percentage){
		System.out.println("invoked report()");
		System.out.println("Percentage:"+percentage);
		if(percentage<=100&&percentage>=85){
			return "Distinction";
		}
		if(percentage<85&&percentage>60){
			return "First class";
		}
		if(percentage<60&&percentage>50){
			return "Second class";
		}
		if(percentage<50&&percentage>35){
			return "Pass";
		}
		return "Fail";
	}
}