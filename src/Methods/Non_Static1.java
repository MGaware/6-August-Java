package Methods;

public class Non_Static1 {

	     //NON STATIC REGULAR METHOD CALL FROM SAME CLASS
          public static void main(String[]args) 
       {
	        System.out.println("HELLO");

       
	        //STEP I-CREATE OBJECT OF SAME CLASS

         Non_Static1 M1=new Non_Static1();                  //CLASS NAME OBJECT NAME=new CLASS NAME();

         //STEP II-CALL THE METHOD
           
             M1.N1();                                       //OBJECT NAME.METHOD NAME();

       }

         //NON STATIC REGULAR METHOD

         public void N1()                        //NON STATIC REGULAR METHOD

      {
        System.out.println("MAHESH KALYAN GAWARE");
	
      }

      }
