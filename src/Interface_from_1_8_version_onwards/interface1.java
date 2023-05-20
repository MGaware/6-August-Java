package Interface_from_1_8_version_onwards;

public interface interface1 {

	//In an interface we can declare abstract,public,default and static methods....> from 1.8 version onwards
	
	//NOW,IN INTERFACE WE CAN DECLARE COMPLETE AS WELL AS INCOMPLETE/ABSTRACT METHODS....>FROM 1.8 VERSION ONWARDS
	
	//NOW,INTERFACE IS NOT PURE 100% ABSTRACT IN NATURE BECAUSE WE CAN DECLARE COMPLETE AS WELL AS INCOMPLETE METHODS IN IT.
	
	
	
	//INCOMPLETE/ABSTRACT METHODS....>WE CAN WRITE IN MULTIPLE WAYS(1.8 VERSION)
	
	void m1();                   //1.7 + 1.8 VERSION
	
	public void m2();            //1.8 VERSION
	
	abstract void m3();          //1.8 VERSION
	
	abstract public void m4();   //1.8 VERSION
	
	//DEFAULT METHOD
	default void m5() 
	{
		
		
	}
	
	//STATIC METHOD...>COMPLETE METHOD(METHOD DEFINATION + METHOD DECLARATION)
	public static void m6() 
	{
		
		System.out.println("mahesh kalyan gaware");
		
	}
	
	//MAIN METHOD....>COMPLETE METHOD
	public static void main(String[] args) 
	{
	
		
		
	}





}
