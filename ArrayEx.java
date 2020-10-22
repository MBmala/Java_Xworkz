public class ArrayEx{
	public static void main(String[] args){
	arrayOfBoolean();	
	}
	public static void arrayOfBoolean(){
		boolean isMoonStar=false;
		boolean twoIsEvenNum=true;
		boolean tomatoIsAFruit=true;
		boolean spiderHas6Legs=false;
		
		boolean[] array={isMoonStar,twoIsEvenNum,tomatoIsAFruit,spiderHas6Legs};
		int size=array.length;
		System.out.println("Total elements :"+size);
		
		boolean elementAtIndex0=array[0];
		System.out.println("Element at index 0 "+elementAtIndex0);
		System.out.println("Element at index 1 "+array[1]);
		System.out.println("Element at index 2 "+array[2]);
		System.out.println("Element at index 3 "+array[3]);
		
	}
}