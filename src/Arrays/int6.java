package Arrays;

public class int6 {

	 //USAGE....>USING DO WHILE LOOP
	
	public static void main(String[] args) 
	{
	
		//STEP I-ARRAY DECLARATION
		
		int a1[]=new int[5];
		
		
		//STEP II-ARRAY INITIALIZATION
		
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		a1[4]=50;
		
		
		//STEP III-USAGE
		
		int a=0;
		do 
		{
			System.out.println(a1[a]);
			a=a+1;
			
		}
		while(a<=4);
		

		
		
		
		
	}
}
