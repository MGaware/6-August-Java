package Methods;


public class Non_static6 {

	public static void main(String[]args) 
	{ 
		//STATIC REGULAR METHOD CALL FROM SAME CLASS
		   s1();                                                                //METHOD NAME();
		
		//NON STATIC REGULAR METHOD CALL FROM SAME CLASS
		  
		   //STEP I-CREATE OBJECT OF SAME CLASS
		    Non_static6 object1=new Non_static6();                              //CLASS NAME OBJECT NAME=new CLASS NAME();		
		 
		    //STEP II-CALL THE METHOD
		    object1.n1();                                                       //OBJECT NAME.METHOD NAME();
	
	
		    
		    
		    
	   //STATIC REGULAR METHOD CALL FROM DIFFERENT CLASS
	        Non_static5.s1();                                                   //CLASS NAME.METHOD NAME();
	        Static2.m1();                                                       //CLASS NAME.METHOD NAME();
	
	   //NON STATIC REGULAR METHOD CALL FROM DIFFERNT CLASS
	     
	       //STEP I-CREATE OBJECT OF DIFFERENT CLASS
	        Non_static5 object2=new Non_static5();                              //CLASS NAME OBJECT NAME=new CLASS NAME();
	        Non_static4 object3=new Non_static4();
	   
	        //STEP II-CALL THE METHOD
	        object2.n1();                                                       //OBJECT NAME.METHOD NAME();
	        object3.S1();                                                       //OBJECT NAME.METHOD NAME();
	
	
	
	}
	

          //STATIC REGULAR METHOD
	       public static void s1()
	{
		
	   	System.out.println("A");
		
	}

        //NON STATIC REGULAR METHOD
	      public void n1() 
	{
		
		System.out.println("B");
		
	}
	
}
