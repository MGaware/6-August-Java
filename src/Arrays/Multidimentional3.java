package Arrays;

public class Multidimentional3 {

	
 //MULTIDIMENTIONAL ARRAY
	
    //0    1    2
//0   10   20   30
//1   40   50   60


public static void main(String[] args) {
	
	  
	//STEP I-ARRAY DECLARATION AND INITIALIZATION
	  
	  int A[][]= {{10,20,30},{40,50,60}};
	
	  
	
	  
	  //STEP II-USAGE...>USING FOR LOOP
	  
	  for(int a=0; a<=1; a++)                        //OUTER FOR LOOP FOR ROWS
	  {
		  
		         for(int b=0; b<=2; b++)            //INNER FOR LOOP FOR COLUMN
		         {
		        	 
		        	System.out.print(A[a][b]+"  "); 
		         }
		     System.out.println();
		 
		  
	  }
	  
	  
}	  
}
