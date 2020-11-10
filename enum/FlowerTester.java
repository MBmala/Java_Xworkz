enum Flower{
	JASMINE,ROSE,LILY,SUNFLOWER,LOTUS
}
public class FlowerTester{
	public static void main(String[] args){
	String value=args[0];
	 Flower name=Flower.valueOf(value);
	 System.out.println("name of flower :"+name);
	 
	 Flower[] allFlower=Flower.values();
	 System.out.println("length of the enum:"+allFlower.length);
	 System.out.println("all flower names");		
	 for(int count=0;count<allFlower.length;count++){
	     System.out.println((count+1)+"."+allFlower[count]); 
	 }
	 
	}
}