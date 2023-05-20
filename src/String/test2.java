package String;

public class test2 {

	
	//DUPLICATE OBJECTS ARE NOT ALLOWED INSIDE CONSTANT POOL AREA...>WITHOUT USING NEW KEYWORD
	
	//DUPLICATE OBJECTS ARE ALLOWED INSIDE NON CONSTANT POOL AREA...>USING NEW KEYWORD
	
	
	public static void main(String[] args) 
	{
	    //USING NEW KEYWORD
		String a1=new String("mahesh");
		String a2=new String("mahesh");
		String a3=new String("mahesh");
		String a4=new String("gaware");
		String a5=new String("kalyan");
		
		//WITHOUT USING NEW KEYWORD
		String a6="suhas";
		String a7="suhas";
		String a8="suhas";
		String a9="hi";
		String aa="gaware";
			
		
		//DIFFERENCE BETWEEN ==(DOUBLE EQUAL OPERATOR) AND .equal METHOD
		
		System.out.println(a1==a2);
		System.out.println(a6==a7);
		System.out.println(a7==a8);
		System.out.println(a6==a9);
		System.out.println(a2==a3);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a4));
		System.out.println(a4.equals(aa));
		
		
		
		
		
	}
	
}
