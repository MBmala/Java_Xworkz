public class CarBrand{
	public static void main(String[] parms){
		String[] brands=getBrands();
		for(int i=0;i<brands.length;i++){
			System.out.println("Car brand " +(i+1)+ ":" +brands[i]);
		}
	}

    public static String[] getBrands(){  
        //declare and init a array of string with car brands		 
		String[] cars={"Tesla","BMW","Audi","Cadillac","Ferrari","Ford","Jaguar","Lamborghini","Suzuki"};
        System.out.println("Number of car brands:"+cars.length);
		return cars;
         
    }

}



 