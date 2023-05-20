package control_statement;

public class nested_if2 {


    public static void main(String[] args)
    {
		
	int elevanth=56;
    int twelth=30;
    
    
    if(elevanth>=35) 
    {
    	
    	System.out.println("QUALIFY FOR 12th");
    	
    
                         if(twelth>=35) 
                     {
                    	  System.out.println("QUALIFY FOR GRADUATION");
            	  
                     }
    
                       else 
                     {
            	  
            	          System.out.println("NOT QUALIFY FOR GRADUATION");
                     }
    
      }
    
  
    else 
    {
    	
    	System.out.println("NOT QUALIFY FOR 12th");
    	
    }
    
    
    
    }


}
