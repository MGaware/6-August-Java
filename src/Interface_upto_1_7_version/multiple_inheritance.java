package Interface_upto_1_7_version;

public class multiple_inheritance implements sample1,sample2,sample3,sample4 {

	//MULTIPLE INHERITANCE-ONE SUB CLASS AQUIRES THE PROPERTY OF TWO OR MORE THAN TWO SUPER CLASSES.   BY USING INTERFACE WE CAN ACHIEVE MULTIPLE INHERITANCE.
	
	//SUB CLASS/CHILD CLASS
	//IMPLEMENTATION CLASS
	
	public void m3()
	{
		
		System.out.println("METHOD M3 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m4()
	{
		
		System.out.println("METHOD M4 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m1()
	{
	
		System.out.println("METHOD M1 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m2()
	{
	
		System.out.println("METHOD M2 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m7()
	{

		System.out.println("METHOD M7 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m8()
	{
	
		System.out.println("METHOD M8 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m5()
	{
	
		System.out.println("METHOD M5 IS COMPLETED IN IMPLEMENTATION CLASS");
	}

	public void m6()
	{
	
		System.out.println("METHOD M6 IS COMPLETED IN IMPLEMENTATION CLASS");
	}


	public static void main(String[] args) 
	{
	
		multiple_inheritance aa=new multiple_inheritance();
		aa.m1();
		aa.m2();
		aa.m3();
		aa.m4();
		aa.m5();
		aa.m6();
		aa.m7();
		aa.m8();
		
	}
}
