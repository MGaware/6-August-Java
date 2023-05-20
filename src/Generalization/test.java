package Generalization;

public class test {

	
	public static void main(String[] args) 
	{
	    //CREATE OBJECT OF JIO CLASS
		jio j1=new jio();
		j1.calling();
		j1.internet();
		j1.sms();
		
		System.out.println("---------------------------------------------------");
		
		//CREATE OBJECT OF AIRTEL CLASS
		airtel a1=new airtel();
		a1.calling();
		a1.internet();
		a1.sms();
		
		System.out.println("----------------------------------------------------");
		
		//CREATE OBJECT OF VI CLASS
		vi v1=new vi();
		v1.calling();
		v1.internet();
		v1.sms();
		
		
		
		
		
	}
	
	
}
