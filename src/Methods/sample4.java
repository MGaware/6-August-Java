package Methods;

public class sample4 {

    public static void main(String[]args) 
    {
    	  studentinfo("mahesh");                                      //METHOD NAME();
    	 
    	  studentinfo('A');                                           //METHOD NAME();
    	  
    	studentinformation("mahesh",22,'A',56.25f,25,855555);         //METHOD NAME();
    }

    //STATIC REGULAR METHOD
    public static void studentinfo(String studentname) 
    {
    	System.out.println(studentname);
    	
    }

    //STATIC REGULAR METHOD
    public static void studentinfo(char studentgrade) 
    {
    	
    	System.out.println(studentgrade);
    	
    }

    //STATIC REGULAR METHOD
    public static void studentinformation(String studentname,int studentrollnumber,char studentgrade,float studentpercentage,int studentage,int studentincome) 
    {
        System.out.println(studentname);
        System.out.println(studentgrade);
        System.out.println(studentpercentage);
        System.out.println(studentrollnumber);
        System.out.println(studentage);
        System.out.println(studentincome);
      
    
    
    
    
    
    }

}
