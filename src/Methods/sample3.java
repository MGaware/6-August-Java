package Methods;


public class sample3 {

    public static void main(String[]args) 
    {
    	d1(2025690,30550);                     //METHOD NAME(); 2 INT PARAMETER
    	d1(100265,20025);                      //METHOD NAME(); 2 INT PARAMETER
    	d1(20565285,36595625);                 //METHOD NAME(); 2 INT PARAMETER
    	
    	
    	d1(10,20,30);                          //METHOD NAME(); 3 INT PARAMETER
    	d1(1526,2562,2323);                    //METHOD NAME(); 3 INT PARAMETER
    	d1(5698,6363,5656);                    //METHOD NAME(); 3 INT PARAMETER
    	
    	d1(10,20,30,40,50,60,70,80,90,100);                                 //METHOD NAME(); 10 INT PARAMETER
    	d1(1,2,3,4,5,6,7,8,9,10);                                           //METHOD NAME(); 10 INT PARAMETER
    	d1(2,56,895,6265,6265,568656,659565,656656,65656565,2598988);       //METHOD NAME(); 10 INT PARAMETER
    	d1(88,88,88,88,88,888,888,88,8888,5656);                            //METHOD NAME(); 10 INT PARAMETER
    	
    }

    //STATIC REGULAR METHOD.......>WITH 2 INT PARAMETER
    public static void d1(int x,int y) 
    {
    	int A=x+y;
    	
    	System.out.println(A);
     } 
    
    //STATIC REGULAR METHOD.....>WITH 3 INT PARAMETER
    public static void d1(int a,int b,int c)
    {
    	int A=a+b+c;
    	
    	System.out.println(A);
    	
    	
    }

    //STATIC REGULAR METHOD .....>WITH 10 INT PARAMETER
    public static void d1(int a,int s,int d,int f,int g,int h,int j,int k,int l,int m) 
    {
    	int A=a+s+d+f+g+h+j+k+l+m;
    	 System.out.println(A);
    	
    }
    
    
}
