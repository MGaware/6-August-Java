package Arrays;

public class char7 {

	

	public static void main(String[] args) 
	{
	
		//STEP I-ARRAY DECLARATION AND INITIALIZATION
		
		char a1[]= {'A','B','C','D','E','F','G','H'};
		
		
		
		//STEP III-USAGE
		
		System.out.println(a1.length);    //SIZE
		
		System.out.println(a1.length-1);  //LAST INDEX
		
		for(int a=0; a<=a1.length-1; a=a+1) 
		{
			System.out.println(a1[a]);
		}
		

	}
	
}
