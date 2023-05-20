package constructor;

public class test5 {

     //STEP I-VARIABLE DECLARATION
	      int num1;                             //NON STATIC GLOBAL VARIABLE
	      int num2;                             //NON STATIC GLOBAL VARIABLE
	
	//STEP II-VARIABLE INITIALIZATION
	     test5()                            //WITHOUT/ZERO PARAMETER USER DEFINED CONSTRUCTOR
	     {
	    	 num1=66;
	    	 num2=67;
	    	 
	     }
	     
	     
	     test5(int a,int b)
	     {
	         num1=a;
	         num2=b;
	    	 
	     }
	     
	
	 //STEP III-USAGE
	     public void a1()
	     {
	    	 int c=num1+num2;
	    	 System.out.println(c);
	    	 
	    	 
	     }

	     public void a2() 
	     {
	    	 int d=num1*num2;
	    	 System.out.println(d);
	    	 
	    	 
	     }
	     








} 
