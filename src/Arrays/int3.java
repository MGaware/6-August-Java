package Arrays;

public class int3 {

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
		
	    System.out.println(a1.length);       //SIZE
		
		System.out.println(a1.length-1);    //LAST INDEX
		
		for(int a=0; a<=a1.length-1; a++) 
		{
			System.out.println(a1[a]);
		}
		
		
	}
	
}
