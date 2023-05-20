package Access_Specifiers;

public class test1 
{        
	   //PUBLIC ACCESS SPECIFIER


	
	public test1()
	{
		
		
	}
	
	
	
	public int a=123;                       //NON STATIC GLOBAL VARIABLE
	
	
	public void m1 ()                      //NON STATIC REGULAR METHOD
	{
		
		System.out.println("mahesh gaware");
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
	
		test1 aa=new test1();
		aa.m1();
		System.out.println(aa.a);
		
		
		
	}
	
	
	
	
	
	
}
