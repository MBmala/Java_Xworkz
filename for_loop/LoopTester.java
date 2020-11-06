public class LoopTester{
    public static void main(String[] displays)
    {
       boolean termination=true;

       for(byte start=0;termination;start++)
        {
	      System.out.println("infinite");
	      System.out.println("Value of iteratation variable :"+start);
	      if(start==3)
	      {
		     termination=false;
	      }
	
        }
    }	
}