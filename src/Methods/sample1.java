package Methods;

public class sample1 {

	
	
       public static void main(String[]args) 
       {
    	 
    	   System.out.println("mahesh gaware");
    	   
    	     m1();                                 //METHOD NAME();
    	   
    	     //STEP I-CREATE OBJECT OF SAME CLASS
    	       sample1 s1=new sample1();                        //CLASS NAME OBJECT NAME=new CLASS NAME();
    	     //STEP II-CALL THE METHOD
    	       s1.m2();                                         //OBJECT NAME.METHOD NAME();
    	   
    	   
       }

      //STATIC REGULAR METHOD........>>>>WITHOUT PARAMETER/ZERO PARAMETER METHOD
       public static void m1() 
       {
    	   int a=100;    //DATA TYPE VERIABLE NAME=VERIABLE INFORMATION
    	   int b=200;    //DATA TYPE VERIABLE NAME=VERIABLE INFORMATION
    	  int A=a+b;     //DATA TYPE VERIABLE NAME=100+200
    	   
    	   System.out.println(A);
       }

     //NON STATIC REGULAR METHOD.....>>>>WITHOUT PARAMETER/ZERO PARAMETER METHOD
       public void m2() 
       {
    	   int a=10;                 //DATA TYPE VERIABLE NAME=VERIABLE INFORMATION
    	   int b=12;                 //DATA TYPE VERIABLE NAME=VERIABLE INFORMATION
    	   int B=a+b;
    	
    	  System.out.println(B);
    	 
    	   
       }
       
    }
