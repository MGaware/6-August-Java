
package Inheritance;

public class hirarchicle_inheritance {

	//HIRARCHICLE INHERITANCE...> multiple sub classes can acquire properties of 1 super class
	
	public static void main(String[] args) 
	{
	
		//CREATE OBJECT OF mahesh1 CLASS
		mahesh1 m1=new mahesh1();
		m1.mobile();
		m1.property();
		
		//CREATE OBJECT OF mahesh2 CLASS
		mahesh2 m2=new mahesh2();
		m2.laptop();
		m2.property();
		
		//CREATE OBJECT OF mahesh3 CLASS
		mahesh3 m3=new mahesh3();
		m3.investment();
		m3.property();
		
		
		
	}
}
