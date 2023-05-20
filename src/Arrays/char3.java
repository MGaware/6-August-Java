package Arrays;

public class char3 {


	public static void main(String[] args) 
	{
	
		//STEP I-ARRAY DECLARATION
		
		char a1[]=new char[6];
		
		
		//STEP II-ARRAY INITIALIZATION
		
		a1[0]='A';
		a1[1]='B';
		a1[2]='C';
		a1[3]='D';
		a1[4]='E';
		a1[5]='F';
		
		
		//STEP III-USAGE
		
		System.out.println(a1.length);    //SIZE
		
		System.out.println(a1.length-1);  //LAST INDEX
		
		for(int a=0; a<=a1.length-1; a=a+1) 
		{
			System.out.println(a1[a]);
		}
		

	}
	
}
