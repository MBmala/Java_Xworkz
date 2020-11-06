public class Country{
	public static void main(String[] args){
		countryName(args);
	}

    public static void countryName(String[] name){
        for(int count=0;count<name.length;count++){
			System.out.println("country name @ index "+count+":"+name[count]);
        }
    }
}

/* or
public class Country{
	public static void main(String[] args){
		for(int count=0;count<args.length;count++){
			System.out.println("country name "+(count+1)+":"+args[count]);
		}
	}
}
*/	