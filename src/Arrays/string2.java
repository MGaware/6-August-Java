package Arrays;

public class string2 {

	

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
		
	
		//STEP III-USAGE(using for loop)
		 
		  
	    //           5<=4
		//           4<=4  a=4+1=5
        //           3<=4  a=3+1=4
        //           2<=4  a=2+1=3
	    //           1<=4  a=1+1=2
        //     a=0   0<=4  a=0+1=1
		
		for(int a=0; a<=4; a=a+1)       //STARTING CONDITION   END CONDITION   INCREMENT
		{
			
			System.out.println(str1[a]);
		}
	


	 
	
	
	
	}
	
	
}
