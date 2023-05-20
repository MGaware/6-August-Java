package Arrays;

public class string3 {

	

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
	
		
	    System.out.println(str1.length);  //5   Array size.....>  to find array size use this syntax
	
	    System.out.println(str1.length-1);  //4   ARRAY LAST INDEX....> INDEX=SIZE-1
	    
	    for(int a=0; a<=str1.length-1; a=a+1) 
	    {
	    	
	    	System.out.println(str1[a]);
	    	
	    }
	
	}
}
