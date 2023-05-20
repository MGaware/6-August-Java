package Methods;

public class Non_static2 {

          //NON STATIC REGULAR METOD CALL FROM SAME CLASS
    
	public static void main(String[]args)         //MAIN METHOD

	{    //MAIN METHOD BODY
	
    System.out.println("HELLO");                //PRINTING STATEMENT

    //STEP I-CREATE OBJECT OF SAME CLASS
       Non_static2 A1=new Non_static2();           //CLASS NAME OBJECT NAME=new CLASS NAME();
       
    
    //STEP II-CALL THE METHOD
       A1.m1();                              //OBJECT NAME.METHOD NAME();
       A1.m2();                              //OBJECT NAME.METHOD NAME(); 
       A1.m3();                              //OBJECT NAME.METHOD NAME();
       A1.m4();                              //OBJECT NAME.METHOD NAME();
       A1.m5();                              //OBJECT NAME.METHOD NAME();
       A1.m5();                              //OBJECT NAME.METHOD NAME();
       A1.m1();
}

  //NON STATIC REGULAR METHOD

     public void m1()                          //NON STATIC REGULAR METHOD
{
    System.out.println("HI");                 //PRINTING STATEMENT
    System.out.println("hii");
}
//NON STATIC REGULAR METHOD
     
     public void m2()
     {
    System.out.println("good morning");	 
    	 
     }

//NON STATIC REGULAR METHOD
     
     public void m3()
     {
    	 
    System.out.println("mahesh");
    
    }

//NON STATIC REGULAR METHOD
     
     public void m4() 
     {
    	 
    System.out.println("gaware");
    	 
     }

//NON STATIC REGULAR METHOD

     public void m5()
     {
    	 
    System.out.println("lata");	 
    	 
     }

}
