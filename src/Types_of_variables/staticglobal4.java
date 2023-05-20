package Types_of_variables;

public class staticglobal4 {

        static  int a=6566;            //STATIC GLOBAL VARIABLE
    
    public static void main(String[] args) {
		
    	int a=44;
    	System.out.println(a);
    	
        System.out.println(staticglobal4.a);        //static int a=6566;
   
	}
  
    public static void m1() 
    {
    	
    	System.out.println(a);
    	
    }
    
    public void m2() 
    {
    	
    	System.out.println(a);
    	
    }


}
