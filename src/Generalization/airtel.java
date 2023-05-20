package Generalization;

public class airtel implements simcard {

	
	//IMPLEMENTATION CLASS 2
	
	public void sms() 
	{
		
		System.out.println("200 SMS");
		
	}
	
	public void calling() 
	{
		
		System.out.println("1000 min");
		
	}
	
	public void internet() 
	{
		
		System.out.println("5 GB");
		
	}
	
	public static void main(String[] args) {
		airtel aa=new airtel();
		aa.calling();
		aa.internet();
		aa.sms();
		
		
	}
	
	
}
