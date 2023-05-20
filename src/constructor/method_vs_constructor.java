package constructor;

public class method_vs_constructor {


	method_vs_constructor()
	{
		System.out.println("hi");
		
		
	}
	
	public void m1() 
	{
		System.out.println("hello");
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		method_vs_constructor s1=new method_vs_constructor();
		s1.m1();
	
	
	
	}



}
