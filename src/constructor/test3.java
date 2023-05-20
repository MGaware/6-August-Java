package constructor;

public class test3 {

     //STEP I-VARIABLE DECLARATION
	 int a;                        //NON STATIC GLOBAL VARIABLE
	 int b;                        //NON STATIC GLOBAL VARIABLE
	 
	 //STEP II-VARIABLE INITIALIZATION
	 test3()                       //WITHOUT PARAMETER USER DEFINED CONSTRUCTOR
	 {
		 a=78;
		 b=74;	 
	 }
	 
	 //STEP III-USAGE
	 public void m1() 
	 {
		 int c=a+b;
		 System.out.println(c);
     }
	 
	 
	 public void m2() 
	 {
		 int d=a*b;
		 System.out.println(d);
		 
	 }
	 
	 public void m3() 
	 {
		 int h=a/b;
		 System.out.println(h);
		 
	 }




}
