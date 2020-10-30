public class Book{
	public static void main(String[] args){
		System.out.println("Jvm invoked main");
		book("beloved");
		book("kavalu",200);
		book("Daatu",100,1.2f);
		book("comic","New Avengers");
		System.out.println("exit main");
	}
	public static void book(String name){
		System.out.println("invoked book with 1 parameter");
		System.out.println("name of book:"+name);
	}
	
	public static void book(String name,int noOfpage){
		System.out.println("invoked book with 2 parameter");
		System.out.println("name of book:"+name);
		System.out.println("number of pages:"+noOfpage);
	}
	
	
	public static void book(String name,int noOfpage,float weight){
		System.out.println("invoked book with 3 parameter");
		System.out.println("name of book:"+name);
		System.out.println("number of pages:"+noOfpage);
		System.out.println("weight of book:"+weight);
	}
	public static void book(String type,String name){
		System.out.println("name of book:"+name);
		System.out.println("type of book:"+type);
	}
}		