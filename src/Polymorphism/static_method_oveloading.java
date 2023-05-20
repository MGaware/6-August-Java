package Polymorphism;

public class static_method_oveloading {

	//IS STATIC METHOD/ MAIN METHOD OVERLOADING IS POSSIBLE IN JAVA ?.....>YES
	
	//IS STATIC METHOD/ MAIN METHOD OVERRIDING IS POSSIBLE IN JAVA ?......>NO
	 
	//METHOD OVERLOADING-DECLARING MULTIPLE METHODS WITH SAME METHOD NAME BUT DIFFERENT ARGUMENTS OR PARAMETERS IN A SAME CLASS.
	
	
	public static void m1() 
	{
		
		System.out.println("mahesh");
		
	}
	
	public static void m1(String a) 
	{
		
		System.out.println(a);
		
	}
	
	public static void m1(char a) 
	{
		
		System.out.println(a);
		
	}
	
	public static void m1(int a) 
	{
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
	
		m1();
		m1("gaware");
		m1('a');
		m1(222);
		
	}
}
