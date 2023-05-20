package Interface_upto_1_7_version;

public class Implementation_class implements interface1  {

	
	// a  m1()  m2()......> interface1-internally present
	
	
	public void m1() 
	{
		
		System.out.println("mahesh");
		
	}
	
	public void m2() 
	{
		
		System.out.println("gaware");
		
	}
	
	public static void main(String[] args) {
		
		 Implementation_class aa=new  Implementation_class ();
		 aa.m1();
		 aa.m2();
		System.out.println(a);
		System.out.println( Implementation_class.a);
	}
	
	
}
