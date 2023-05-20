package Types_of_variables;


public class nonstaticglobal5 {



    int c=56412;             //NON STATIC GLOBAL VARIABLE
    
    public static void main(String[] args)
      {
		  nonstaticglobal4 aa=new nonstaticglobal4();
  	      System.out.println(aa.c);
  	  
  	  
  	     b1();
  	   
  	   aa.b2();
  	
  	 
	  }
    
    public static void b1() 
    {
  	  
  	  nonstaticglobal4 bb=new nonstaticglobal4();
  	  System.out.println(bb.c);
  	  
    }
    
    public void b2() 
    {
  	  
  	  System.out.println(c);
  	  
    }







}
