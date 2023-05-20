package constructor;

public class test1 {

    //USE I-TO COPY/LOAD  MEMBERS OF CLASS INTO OBJECT...> WHEN WE CREATE OBJECT OF CLASS
	//test1();.....>DEFAULT CONSTRUCTOR/IMPLICIT CONSTRUCTOR(Provided by compiler)
	
   public static void main(String[] args) 
   {   
	   test1 aa=new test1();        //CLASS NAME OBJECT NAME=new CLASS NAME();
	   aa.m1();                     //OBJECT NAME.METHOD NAME();
	
 
   
   }
   
   public void m1()            //NON STATIC REGULAR METHOD
   {
	   
	  int a=10;
	  int b=20;
	    
	  int c=a*b;
	  
	  System.out.println(c);
	   
   }



}
