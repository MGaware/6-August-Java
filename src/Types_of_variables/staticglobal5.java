package Types_of_variables;

public class staticglobal5 {


    static  int a=6566;            //STATIC GLOBAL VARIABLE

public static void main(String[] args) {
	
	
	System.out.println(a);
	
    m1();
    
    staticglobal5 aa=new staticglobal5();
    aa.m2();

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
