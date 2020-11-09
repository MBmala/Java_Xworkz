public class TheaterFinder{

public static void lowestAndBestUsingEnum(Theater theaterName)
{

System.out.println("invoked lowestAndBestUsingEnum");
	System.out.println("arg 1 theaterName   "+theaterName);	
	switch(theaterName){
		case PVR:
				System.out.println("case is " +theaterName);
				System.out.println("rating:4");
				break;
		case Cinipolis:
				System.out.println("case is " +theaterName);
				System.out.println("rating:4.2");
				break;
		case Urvashi:
				System.out.println("case is " +theaterName);
				System.out.println("rating:4.5");
				break;
		case Ravi:
				System.out.println("case is " +theaterName);
				System.out.println("rating:3");
				break;			
	}
	
	System.out.println("Exitt:: lowestAndBestUsingEnum");
}

}