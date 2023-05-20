package this_and_super_keyword;

public class test1 extends test2 {

	
	
	test1()
	{
		
		
		
	}
	
	
	
	
	
	
	int a=52;             //NON STATIC GLOBAL VARIABLE
	
	int b=55;             //NON STATIC GLOBAL VARIABLE
	
	//int a=100;            extended
	//int b=200;            extended
	

	public void m1() 
	{
		
		int a=10;
		int b=788;
		
		
	    System.out.println(a);        //10
		System.out.println(b);        //788
		System.out.println(this.a);   //52
		System.out.println(super.a);  //100
		System.out.println(this.b);   //55
		System.out.println(super.b);  //200
		
	}
	
	
	public static void main(String[] args) 
	{
	
		test1 aa=new test1();
		aa.m1();
		
	
	}
	
	
}
