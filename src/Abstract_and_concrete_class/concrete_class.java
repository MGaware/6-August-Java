package Abstract_and_concrete_class;

public class concrete_class extends abstract_class {

	// m1()  m2()  m3()  m4().....>internally present.
	
	//SUB CLASS/CHILD CLASS
	
	//COMPLETE CLASS....>CONCRETE CLASS
	
	//COMPLETE METHOD
	public void m3() 
	{
		
		System.out.println("mahesh");
		
	}
	
	
	//COMPLETE METHOD
	public void m4() 
	{
		
		System.out.println("gaware");
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		concrete_class aa=new concrete_class();
		aa.m1();
		aa.m2();
		aa.m3();
		aa.m4();
		
		
	}
	
}
