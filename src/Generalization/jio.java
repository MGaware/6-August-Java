package Generalization;

public class jio implements simcard {

	//IMPLEMENTATION CLASS 1
	
	public void sms() 
	{
		
		System.out.println("100 SMS");
		
		
	}
	
	public void calling() 
	{
		
		System.out.println("UNLIMITED");
		
	}
	
	public void internet() 
	{
		
		System.out.println("1 GB");
		
	}
	
	public static void main(String[] args) {
		jio aa=new jio();
		aa.sms();
		aa.calling();
		aa.internet();
		
		
		
		
	}
	
	
}
