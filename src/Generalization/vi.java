package Generalization;

public class vi implements simcard {

	
	//IMPLEMENTATION CLASS 3
	
	public void sms() 
	{
		
		System.out.println("300 SMS");
		
	}
	
	public void calling() 
	{
		
		System.out.println("2000 min");
		
	}
	
	public void internet() 
	{
		
		System.out.println("10 GB");
		
	}
	
	public static void main(String[] args) {
		vi aa=new vi();
		aa.calling();
		aa.internet();
		aa.sms();
		
		
	}
	
}
