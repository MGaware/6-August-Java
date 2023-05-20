package Methods;

public class sample6 {

     public static void main(String[]args) 
     {
    	 //STATIC & NON STATIC REGULAR METHOD CALL FROM SAME CLASS.....>WITH PARAMETER
    	  
    	 mahesh("MAHESH GAWARE",25,true);                                    //METHOD NAME();
    	 
    	  sample6 d1=new sample6();                                          //CLASS NAME OBJECT NAME=new CLASS NAME();
    	  d1.mahesh(55,59899L,'a');                                          //OBJECT NAME.METHOD NAME();
    	
    	  
    	//STATIC & NON STATIC REGULAR METHOD CALL FROM DIFFERENT CLASS......>WITH PARAMETER
    	  
    	    sample7.A(55, "jdsdjjsk5ds^$@#%$%^6454GFGH");                 //CLASS NAME.METHOD NAME();
    	  
    	    sample7 s1=new sample7();                              //CLASS NAME OBJECT NAME=new CLASS NAME();
    	    s1.A("JFKDJKFD654",'D',54.55f);                        //OBJECT NAME.METHOD NAME();
     }
    
     
     //STATIC REGULAR METHOD......>WITH PARAMETER/ARGUMENT/ZERO PARAMETER
     public static void mahesh(String a,int b,boolean c) 
     {
    	 
    	 System.out.println("Name-"+a);
    	 System.out.println("Age-"+b);
    	 System.out.println(c);
    	 
     }

     //NON STATIC REGULAR METHOD......>WITH PARAMETER
     public void mahesh(int a,long b,char c) 
     {
    	 
    	 System.out.println(a);
    	 System.out.println(b); 
    	 System.out.println(c);
     
     }
     
     
     
}
