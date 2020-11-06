public class AddressTester{
	    public static void main(String[] addr){
			short door=Address.doorNo;//assigning value of class variable"doorNo" in local variable "door"
			System.out.println("Door number:"+door);
			System.out.println("City:"+Address.city);
			System.out.println("Street name:"+Address.street);
			System.out.println("Pincode:"+Address.pincode);
			//printing default values
			System.out.println("Block no:" +Address.blockNo);//default value 0
			System.out.println("District:"+Address.dist);//default value null
		}
}