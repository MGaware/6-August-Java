package Polymorphism;

public class method_overriding {

	//METHOD OVERRIDING--AQUIRING SUPER CLASS METHOD INTO SUB CLASS USING EXTENDS KEYWORD CHANGING DEFINITION ACCORDING TO SUBCLASS SPECIFICATION. 
	
	public static void main(String[] args) 
	{
		father bb=new father();
		bb.car();
		bb.home();
		bb.money();
		
		
		
		System.out.println("----------------------------------------------");
	
		son aa=new son();
		aa.car();
		aa.home();
		aa.mobile();
		aa.money();
		
		
	}
	
	
	
}
