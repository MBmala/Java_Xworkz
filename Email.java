public class Email{
 public static void main(String[] params){
  //main method is invoked by JVM
  arrayOfEmail();// arrayOfEmail method invoked by main
 }
 public static void arrayOfEmail(){
  String omkarEmail="omkarmb05@gmail.com";
  String malaEmail="mbmala005@gmail.com";
  String madhuEmail="madhumb166@gmail.com";
  //array  declaration and initialization.
  String[] mail={omkarEmail,malaEmail,madhuEmail,"mala.xworkz@gmail.com","apeksha.xworkz@gmail"};
  //size of array
  int size=mail.length;
  System.out.println("Size of array is " +size);
  //printing array elements by using array index
  String elementAtIndex0=mail[0];
  System.out.println("Array element at index zero is "+elementAtIndex0);
  
  String elementAtIndex3=mail[3];
  System.out.println("Array element at index three is "+elementAtIndex3);
 }
}