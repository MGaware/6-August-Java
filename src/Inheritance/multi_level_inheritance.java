package Inheritance;

public class multi_level_inheritance {

	//MULTI LEVEL INHERITANCE....> 1 sub class acquires properties of another super class and that class acquires properties of another super class and phenomenon continues.
	public static void main(String[] args) 
	{
		
	   //CREATE OBJECT OF  whatsapp_v2 CLASS
		 whatsapp_v2 a1=new  whatsapp_v3();
		 a1.audiocall();
		 a1.textmsg();
		 
		 
	   //CREATE OBJECT OF  whatsapp_v3 CLASS
		 whatsapp_v3 a2=new  whatsapp_v3();
		 a2.audiocall();
		 a2.textmsg();
		 a2.videocall();
	
	
	}
	
	
}
