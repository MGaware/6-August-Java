package constructor;

public class test7 {


       //STEP I-VARIABLE DECLARATION
	        int a;                                    //NON STATIC GLOBAL VARIABLE
	        int b;                                    //NON STATIC GLOBAL VARIABLE
	        String sname;                             //NON STATIC GLOBAL VARIABLE
	        
	  //STEP II-VARIABLE INITIALIZATION
	       test7()                                    //ZERO PARAMETER USER DEFINED CONSTRUCTOR
	       {
	    	   a=568;
	    	   b=52;
	    	   
	       }
	       
	       test7(String studentname)                  //WITH PARAMETER USER DEFINED CONSTRUCTOR
	       {
	    	   
	    	   sname=studentname;
	    	   
	       }
	    
          
          //STEP III-USAGE
	       public void m1() 
	       {
	    	   
	    	   int num=a*b;
	    	   System.out.println(num);
	    	   
	       }
	       
	       public void m2() 
	       {
	    	   System.out.println(sname);
	    	   
	    	   
	       }
         


}
