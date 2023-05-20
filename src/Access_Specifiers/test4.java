package Access_Specifiers;

public class test4 {

      //DEFAULT ACCESS SPECIFIER
	
	test4()
	{
	
		
		
	}
	
	
	
	
	
	int a=456;          //NON STATIC GLOBAL VARIABLE
	

	void m1() 
	{
		System.out.println("mahesh kalyan gaware");
		
	}
	
	
	public static void main(String[] args) 
	{
	
		test4 t4=new test4();
		t4.m1();
		System.out.println(t4.a);
		
		
		
	}
	
	
	
	
}
