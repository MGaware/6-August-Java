package constructor;

public class test2 {

    //USE I-TO COPY/LOAD  MEMBERS OF CLASS INTO OBJECT...> WHEN WE CREATE OBJECT OF CLASS
	//USE II-TO INITIATE DATA MEMBER/VARIABLE.
	
    //STEP I-VARIABLE DECLARATION
	  int a;             //NON STATIC GLOBAL VARIABLE
	  int b;             //NON STATIC GLOBAL VARIABLE
	  
	//STEP II-VARIABLE INITIALIZATION
	  test2()             //USER DEFINED CONSTRUCTOR
	  {
		  a=10;
		  b=20;
		  
	  }
	  
	//STEP III-USAGE
	  public void m1() 
	  {
	  
		  int c=a*b;
	     System.out.println(c);  
	  }  
	  
	  
	  public static void main(String[] args) 
	  {
		  test2 aa=new test2();
		  aa.m1();
	
	  
	  
	  }



}
