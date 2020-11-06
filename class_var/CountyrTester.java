public class CountyrTester{
	public static void main(String[] args){
		String otherName=Country.name;
		System.out.println("Name of the country:"+otherName);
		otherName="Bharat";
		System.out.println("India aslo called as:"+otherName);
		System.out.println("No of states in India:"+Country.noOfStates);
		System.out.println("Capital of India:"+Country.capital);
		System.out.println("population in 2018:"+Country.population);
		Country.population=1380004385L;//changing the value
		System.out.println("population in 2020:"+Country.population);
		System.out.println("Literacy %:"+Country.literacy);
		System.out.println("Goog landmarks:"+Country.landmarks);
		
	}
}