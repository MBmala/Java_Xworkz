package com.xworkz.mobile;
import com.xworkz.mobile.obj.Mobile;
public class MobileTester {

	public static void main(String[] args) {
	
		Mobile mobile=new Mobile();
		mobile.model="oppo A53";
		mobile.color="gray";
	    mobile.ram=4;
	    mobile.camera="13px tripple camera";
	    Mobile.battery=5000;
	    mobile.displayInfo();
	    
	    Mobile mobile1=new Mobile();
		mobile1.model="redmi";
		mobile1.color="black";
	    mobile1.ram=4;
	    mobile1.camera="13px quad camera";
	    Mobile.battery=2000;
	    mobile1.displayInfo();
	    
	    Mobile mobile2=new Mobile();
		mobile2.model="LAVA";
		mobile2.color="black";
	    mobile2.ram=3;
	    mobile2.camera="5px";
	    Mobile.battery=2500;
	    mobile2.displayInfo();
	    
	    Mobile mobile3=new Mobile();
		mobile3.model="Vivo";
		mobile3.color="blue";
	    mobile3.ram=4;
	    mobile3.camera="16px";
	    Mobile.battery=3000;
	    mobile3.displayInfo();
	    
	    Mobile mobile4=new Mobile();
		mobile4.model="iPhone";
		mobile4.color="white";
	    mobile4.ram=4;
	    mobile4.camera="24px";
	    Mobile.battery=5000;
	    mobile4.displayInfo();
	    
	    Mobile mobile5=new Mobile();
		mobile5.model="Honor";
		mobile5.color="red";
	    mobile5.ram=2;
	    mobile5.camera="8px";
	    //Mobile.battery=2000; it takes previous value.
	    mobile5.displayInfo();
	    
	    Mobile mobile6=new Mobile();
		mobile6.model="samsung";
		mobile6.color="black";
	    mobile6.ram=4;
	    mobile6.camera="13px";
	    Mobile.battery=5000;
	    mobile6.displayInfo();

	}

}

