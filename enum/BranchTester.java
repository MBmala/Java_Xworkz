  
enum Branch{
COMPUTERSCIENCE,MECHANICAL,ELECTRONICS,CIVIL,ELECTRICAL,INFORMATIONSCIENCE
}

public class BranchTester{

public static void main(String[] args)
{
	String value="CIVIL";
	Branch name=Branch.valueOf(value);
	 System.out.println("name of branch :"+name);
	 
	 Branch[] allBranch=Branch.values();
	 System.out.println("length of the enum:"+allBranch.length);
	 System.out.println("all branch names");		
	 for(int count=0;count<allBranch.length;count++){
	     System.out.println((count+1)+"."+allBranch[count]); 
	 }
		
}

}