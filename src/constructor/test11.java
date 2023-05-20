package constructor;

public class test11 {

    //can you call one constructor into another constructor ?.....>yes
	
	//STEP I- VARIABLE DECLARATION
	String a;
	int b;
	
	//STEP II-VARIABLE INITIALIZATION
	test11()
	{
		
	this("mahesh");
	
	}

	test11(String e)
	{
		
		
		
	}
	
	test11(String c,int d)
	{
		
		a=c;
		b=d;
		
	}
	
	//STEP III-USAGE
	
	public void M1() 
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) 
	{
	   test11 d1=new test11();
	   d1.M1();
	
	
	}







}
