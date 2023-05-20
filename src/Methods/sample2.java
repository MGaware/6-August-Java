package Methods;

public class sample2 {

     public static void main(String[]args) 
     {
    	 
    	 System.out.println("mahesh gaware");
    	 
    	  b1();                                      //METHOD NAME();
    	  
    	  
    	 a1("mahesh");
    	 a1("suhas");                    //INFORMATION REUSABILITY
    	 a1("kalyan");                   //INFORMATION REUSABILITY
     }

     //STATIC REGULAR METHOD.....>WITHOUT PARAMETER
     public static void b1() 
     {    byte a=100;
          byte b=50;
    	 int c=a+b;
    	 System.out.println(c);
     }
      
     //STATIC REGULAR METHOD------>WITH PARAMETER/ARGUMENT....> 2 INTEGER PARAMETER
      public static void a1(String a)
      {
     
           
           System.out.println(a);
      
      }
}
