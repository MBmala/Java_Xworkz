public class SportTester{

public static void main(String[] names)
{
		String sportCricket="CRICKET";
	
	    Sport convertedCricketFromString=Sport.valueOf(sportCricket);
	
	    System.out.println(convertedCricketFromString);
	
	
	Sport[] allSports=Sport.values();
	System.out.println(allSports.length);
	for(int sportsInitial=0;sportsInitial<allSports.length;sportsInitial++){
		System.out.println("index " + sportsInitial);
		Sport sportValue=allSports[sportsInitial];
		System.out.println("sport enum Value " + sportValue);	
	}
		
}
}