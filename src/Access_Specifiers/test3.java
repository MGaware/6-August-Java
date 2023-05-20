package Access_Specifiers;

public class test3 {

          //PRIVATE ACCESS SPECIFIER
	
	private test3()
	{
		
		
	}
	
	
	
	private int a=456;
	
	
	private void m1() 
	{
		
		System.out.println("hello");
		
	}
	

	public static void main(String[] args) 
	{
	
		test3 d1=new test3();
		d1.m1();
		System.out.println(d1.a);
		
	}
	
}
