package Polymorphism;

public class sample1 {

	
	
	public static void main(String[] args) {
		
		m2();
		
		
	}
	
	
	public void m1()                                       //NON STATIC METHOD DECLARATION.....>HEAP AREA
	{
		
		System.out.println("mahesh kalyan gaware");        //METHOD DEFINATION.....>METHOD AREA
		
	}
	
	
	public static void m2()                                //STATIC METHOD DECLARATION.....>STATIC POOL AREA
	{
		System.out.println("hello");                       //METHOD DEFINATION.....>METHOD AREA
		
	}
	
}
