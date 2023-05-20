package Interface_from_1_8_version_onwards;

public class demo1 implements interface2 {

	//IMPLEMENTATION CLASS-I
	
	//m1()  m2()  m3()
	
	public void m1()
	{
		
		System.out.println("good morning mahesh");
	}

	
	public void m2()                            //default method of interface2
	{
		
		System.out.println("good morning");     //method overriding
		
	}
	
	 
	public static void main(String[] args) 
	{
		demo1 aa=new demo1();
		aa.m1();
		aa.m2();
		aa.m3();
		
		
	}

 
	
		
		
	
	
	
}
