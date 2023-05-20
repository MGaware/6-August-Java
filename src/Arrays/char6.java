package Arrays;

public class char6 {

	   //USING DO WHILE LOOP
	

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
		
		int a=0;
		do 
		{
			System.out.println(a1[a]);
			a=a+1;
			
		}
		while(a<=5);
	
	}
	
	
}
