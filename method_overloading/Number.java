public class Number{
	public static void main(String[] args){
		System.out.println("Jvm invoked main");
		add(1,3);
		add(2,6,9);
		add(7,8.9f);
		add(1.23f,4);
		double a=2.87875435;
		int b=908;
		long c=8787687544L;
		add(a,b,c);
		System.out.println("exit main");
	}

   public static void add(int num1,int num2){
	   int addOf2Num=num1+num2;
	   System.out.println("Addition of 2 numbers :"+addOf2Num);
   }
   
   public static void add(int num1,int num2,int num3){
	   int addOf3Num=num1+num2+num3;
	   System.out.println("Addition of 3 numbers :"+addOf3Num);
   }
   
   public static void add(int num1,float num2){
	   float addOf2No=num1+num2;
	   System.out.println("Addition of 2 numbers :"+addOf2No);
   }
   
   public static void add(float num1,int num2){
	   float addOf2Nums=num1+num2;
	   System.out.println("Addition of 2 numbers :"+addOf2Nums);
   }
   
   public static void add(double num1,int num2,long num3){
	   double addOf3No=num1+num2;
	   System.out.println("Addition of 2 numbers :"+addOf3No);
   }
}