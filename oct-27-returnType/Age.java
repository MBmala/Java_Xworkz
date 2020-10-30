public class Age{
	
	public static void main(String[] args){
		System.out.println("JVM invoked main");
		byte howOld=23;
		String value=ageDefination(howOld);
		System.out.println("return value from ageDefinition():" +value);
		System.out.println("end of main");
	}
	
    public static String ageDefination(byte age){
    System.out.println("invoked ageDefinition()");
	System.out.println("age:" +age);
	
	boolean childAge=(age>0&&age<=5);
		if(childAge)
		{
			System.out.println("Age between 0 to 5");
			return "kid";
		}
	/*if(age>0&&age<=5){
    System.out.println("Age between 0 to 5");
	return "kid";*/
	}
	if(age>5&&age<=12){
		System.out.println("Age between 5 to 12");
		return "child";
	}
	if(age>12&&age<=18){
		System.out.println("Age between 12 to 18");
		return "teen";
	}
	if(age>18&&age<=50){
		System.out.println("Age between 18 to 50");
		return "adult";
	}
	if(age>50&&age<100){
		System.out.println("Age between 50 to 100");
		return "old";
	}
	return "centenar";
	
  }

}