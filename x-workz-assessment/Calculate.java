/*4)Method:It is used perform particular tasks.we can reuse the statements
      in below program add() is method name to perform addition of 2 nums.
	  Ex:returnType methodname(){
		  Stmt1;
		  stmt2;
	  }
	  
    parameter:It is variable difined in method defination.
         ex:add(int val1,int val2)	  

    Argument: the values passed to method during invoking the method.
        ex:add(10,20); here 10,20 are args

    ReturnType:datatype defined in method declaration.It returns to main method based on datatype of the method.
           void  does not returns any value. 		
            Ex:return addition; returnType is int type.

*/

public class Calculate{
	
	public static void main(String[] args)
	{
		int sum=add(10,20);
		System.out.println("addition of 2 nums"+sum);
	}
	
	public static int add(int val1,int val2){
		System.out.println("valuu 1:"+val1);
		System.out.println("valuu 2:"+val2);
		int addition=val1+val2;
		return addition;
		
	}
}