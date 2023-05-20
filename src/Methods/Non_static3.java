package Methods;

public class Non_static3 {

	//NON STATIC REGULAR METHOD CALL FROM DIFFERENT CLASS
    
	public static void main(String[]args) 
    {
    	System.out.println("MAHESH");
    	
    
    //STEP I-CREATE OBJECT OF DIFFERENT CLASS
    	Non_static4 object1=new Non_static4();                        //CLASS NAME OBJECT NAME=new CLASS NAME();
    
    //STEP II-CALL THE METHOD
        object1.S1();                                                 //OBJECT NAME.METHOD NAME();
    	object1.S2();                                                 //OBJECT NAME.METHOD NAME();
    	object1.S3();                                                 //OBJECT NAME.METHOD NAME();
    	object1.S4();                                                 //OBJECT NAME.METHOD NAME();
    	object1.S5();                                                 //OBJECT NAME.METHOD NAME();
    
    }
    

}
