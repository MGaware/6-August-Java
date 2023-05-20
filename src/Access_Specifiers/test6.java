package Access_Specifiers;

public class test6 {

	
	    //PROTECTED ACCESS SPECIFIERS
	
	protected test6()
	{
		
		
		
	}
	
	
	
	protected int a=456;
	
	
	protected void a1() 
	{
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) {
		
		test6 aa=new test6();
		aa.a1();
		System.out.println(aa.a);
		
		
		
	}
}
