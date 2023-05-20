package control_statement;

public class nested_if1 {

    public static void main(String[] args) 
    {
		
	  String UN="mahesh";
	  
	  String password="mahesh@123";
    
       
	      if("mahesh"==UN) 
           {
        	   System.out.println("correct UN");
        	   
                 
        	   
        	               if("mahesh@123"==password) 
                          {
                	            System.out.println("correct password.....login successful");
                	  
                	  
                          }    	
                           else 
                          {
                	            System.out.println("wrong password....login failed");
                	  
                           }
    	
           }
          
           
           else 
           {
        	   
        	   System.out.println("wrong UN login failed");
        	   
           }
    
    }
    




}
