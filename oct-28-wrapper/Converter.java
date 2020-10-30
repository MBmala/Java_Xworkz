  public class Converter{
	
	public static void main(String[] values)
	{
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to primitive types");
		
		String primitiveTypes="8";
		byte type=Byte.parseByte(primitiveTypes);
		System.out.println("converted byte :"+type);
		
		String doorNo="201";
		short convertedDoorNo=Short.parseShort(doorNo);
		System.out.println("converted short :"+convertedDoorNo);
		
		String salary="75000";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("converted int :"+convertedSalary);
		
		String adharNo="987645631264";
		long convertedAdharNo=Long.parseLong(adharNo);
		System.out.println("converted long :"+convertedAdharNo);
		
		String cgpa="7.26";
		float convertedCgpa=Float.parseFloat(cgpa);
		System.out.println("converted float :"+convertedCgpa);
		
		String volt="5.6324678632";
		double convertedVolt=Double.parseDouble(volt);
		System.out.println("converted double :"+convertedVolt);
		
		String isMoonStar="false";
		boolean convertedString=Boolean.parseBoolean(isMoonStar);
		System.out.println("converted boolean :"+convertedString);
		
		String color="green";
		char letter=color.charAt(0);
		System.out.println("First letter in green: "+letter);
		
		System.out.println("EXIT :: main");
					
	}
	
	
}