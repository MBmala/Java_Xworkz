public class Percentage{
	public static void main(String[] args){
	arrayOfPercentage();	
	}
	public static void arrayOfPercentage(){
		float tenth=88.80f;
		float puc=80.00f;
		float degree=65.62f;
		
		float[] result={tenth,puc,degree};
		
		int arraySize=result.length;
		System.out.println("Size of array is:"+arraySize);
		
		float elementAtIndex0=result[0];
		System.out.println("Tenth percentage "+elementAtIndex0);
		float elementAtIndex1=result[1];
		System.out.println("Twelfth percentage "+elementAtIndex1);
		float elementAtIndex2=result[2];
		System.out.println("Degree percentage "+elementAtIndex2);
		
	}
}