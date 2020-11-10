enum Month{
    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,LULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
}

public class MonthTester{
	public static void main(String[] args){
	String value="OCTOBER";
	 Month name=Month.valueOf(value);
	 System.out.println("name of month :"+name);
	 
	 Month[] allMonth=Month.values();
	 System.out.println("length of the enum:"+allMonth.length);
	 System.out.println("all month names");		
	 for(int count=0;count<allMonth.length;count++){
	     System.out.println((count+1)+"."+allMonth[count]); 
	 }
	 
	}
}
