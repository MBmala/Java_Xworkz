public class Area{
	public static void main(String[] args){
		System.out.println("Jvm invoked main");
		area(5);
		area(3,8.6f);
		area(1.4f,5);
		area(2,3.5f,7);
		System.out.println("exit main");
	}
	
	public static void area(int side){
		int square=side*side;
		System.out.println("Area of square:"+square);
	}
	
	public static void area(int base,float height){
		float rect=base*height;
		System.out.println("Area of rectangle:"+rect);
	}
	
	public static void area(float base,int height){
		float rect=base*height;
		System.out.println("Area of rectangle:"+rect);
	}
	public static void area(int a,float b, int h){
		float trapezium=0.5f*(a+b)*h;
		System.out.println("Area of trapezium:"+trapezium);
	}
	
}