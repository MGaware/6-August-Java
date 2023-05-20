package Arrays;

public class string6 {

	   //USAGE....>USING DO WHILE LOOP
	
	public static void main(String[] args) 
	{
	
		//STEP I-ARRAY DECLARATION
		
		String str1[]=new String[5];              //information data type    array name[]=new keyword   array size;
		
		
		//STEP II-ARRAY INITIALIZATION
		
		str1[0]="mahesh";
		str1[1]="viraj";
		str1[2]="suhas";
		str1[3]="kalyan";
		str1[4]="lata";
		
	
		//STEP III-USAGE
		
		int a=0;
		do 
		{
			System.out.println(str1[a]);
			a=a+1;
			
		}
	    while(a<=4);
	
	 
	
	
	
	}
	
}
