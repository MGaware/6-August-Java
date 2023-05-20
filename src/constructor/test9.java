package constructor;

public class test9 {


     //STEP I-VARIABLE DECLARATION
	String sname;                 //NON STATIC GLOBAL VARIABLE
	int srollno;                  //NON STATIC GLOBAL VARIABLE
	float sper;                   //NON STATIC GLOBAL VARIABLE
	char sgrade;                  //NON STATIC GLOBAL VARIABLE
	long smono;                   //NON STATIC GLOBAL VARIABLE
	
	//STEP II-VARIABLE INITIALIZATION
	test9(String studentname,int studentrollnumber,float studentpercentage,char studentgrade,long studentmobilenumber)
	{
		sname=studentname;
		srollno=studentrollnumber;
		sper=studentpercentage;
		sgrade=studentgrade;
		smono=studentmobilenumber;
		
	}
	
	//STEP III-usage
	public void m1() 
	{
		System.out.println(sname);
		System.out.println(srollno);
		System.out.println(sper);
		System.out.println(sgrade);
		System.out.println(smono);
		
		
		
		
		
		
	}


}
