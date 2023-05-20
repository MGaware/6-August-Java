package Arrays;

public class Multidimentional1 {

	      //MULTIDIMENTIONAL ARRAY
	
	      //0    1    2
     //0   10   20   30
     //1   40   50   60
	
	
	  public static void main(String[] args) {
		
		  //STEP I-ARRAY DECLARATION
		  
		  int A[][]=new int[2][3];
		  
		  
		  //STEP II-ARRAY INITIALIZATION
		  
		  A[0][0]=10;
		  A[0][1]=20;
		  A[0][2]=30;
		  A[1][0]=40;
		  A[1][1]=50;
		  A[1][2]=60;
		  
		  
		  //STEP III-USAGE
		  
		  System.out.println(A[0][0]);
		  System.out.println(A[0][1]);
		  System.out.println(A[0][2]);
		  System.out.println(A[1][0]);
		  System.out.println(A[1][1]);
		  System.out.println(A[1][2]);
		  
				 
				 
		  
		  
		  
	}
	
	
	
	
	
	
}
