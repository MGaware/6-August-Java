package Methods;

public class sample5 {

    public static void main(String[]args) 
    {
    	
    	  sample5 d1=new sample5();                          //CLASS NAME OBJECT NAME=new CLASS NAME();
    	
    	   d1.m1();                                          //OBJECT NAME.METHOD NAME();
    	
    	   d1.m1(10,20,30);                                  //OBJECT NAME.METHOD NAME(); WITH 3 INT PARAMETER
    	   d1.m1(4,5,5);
    	 
         
    }
    //NON STATIC REGULAR METHOD.....>WITHOUT ARGUMENT/PARAMETER
    public void m1()
    {
    	int a=20;
    	int b=256;
    	int sum=a+b;
    	
    	System.out.println(sum);
    }

    //NON STATIC REGULAR METHOD.....>WITH 3 INT PARAMETER/ARGUMENT
    public void m1(int a,int b,int c) 
    {
    	int A=a+b+c;
    	int B=a*b*c;
    	System.out.println(A);
    	System.out.println(B);
    }





}
