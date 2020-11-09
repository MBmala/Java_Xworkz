public class TheaterTester{


public static void main(String[] args)
{

System.out.println("invoked main, doing switch and enum");

String name="PVR";
Theater theaterName=Theater.valueOf(name);
TheaterFinder.lowestAndBestUsingEnum(theaterName);

TheaterFinder.lowestAndBestUsingEnum(Theater.Ravi);

System.out.println("EXIT :: main, doing switch and enum");
}

}