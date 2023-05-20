
package this_and_super_keyword;

public class test3 extends test2 {

	
	int a=1000;                //NON STATIC GLOBAL VARIABLE
	
	//int a=100;                extended
	//int b=200;                extended
	
	
	public void m2() 
	{
		int a=2000;
		
		System.out.println(a);           //2000
		System.out.println(this.a);      //1000
		System.out.println(super.a);     //100
		System.out.println(b);           //200
		System.out.println(this.b);      //200
		System.out.println(super.b);     //200
		
		
	}
	
	public static void main(String[] args)  
	{
	    test3 dd=new test3();
		dd.m2();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
