public class MobileTester{
	public static void main(String[] args)
    {
       String unlockValue=Mobile.getUnlock();
       System.out.println("unlockValue"+unlockValue);
	   
       String value=args[0];
       Mobile.setUnlock(value);

       unlockValue=Mobile.getUnlock();
       System.out.println("unlockValue"+unlockValue);
	}
}