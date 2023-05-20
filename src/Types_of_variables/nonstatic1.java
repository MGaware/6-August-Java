package Types_of_variables;

public class nonstatic1 {


      int a=5698;                                        //NON STATIC GLOBAL VARIABLE
      
      //NON STATIC GLOBAL VARIABLE CALL FROM SAME CLASS
      
      public static void main(String[] args) 
      {
		//STEP I-CREATE OBJECT OF SAME CLASS
    	
    	  nonstatic1 aa=new nonstatic1();              //CLASS NAME OBJECT NAME=new CLASS NAME();
          System.out.println(aa.a);                    //(OBJECT NAME.VARIABLE NAME);
    
     
      }





}
