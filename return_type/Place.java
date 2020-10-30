public class Place{
	public static String finder(int fromDistance){
		System.out.println("finder method invoked");
		System.out.println("fromDistance "+fromDistance);
		if(fromDistance==400){
			System.out.println("Banglore");
			return "Banglore";
		}
		if(fromDistance==1500){
			System.out.println("Gujarat");
			return "Gujarat";
		}
		if(fromDistance==2000){
			System.out.println("kashi");
			return "kashi";
		}
		if(fromDistance==50){
			System.out.println("hubli");
			return "hubli";
		}
		if(fromDistance==40){
			System.out.println("Gadag");
			return "Gadag";
		}
		if(fromDistance>=100000){
			System.out.println("place Not in earth");
			return "place Not in earth";
		}
		return "place not found";
	}
}