package String;

public class string_methods {

	
	public static void main(String[] args) 
	{
	
		String a1="mahesh";
		String a2="MAHESH";
		String a3="ABC";
		String a4="";
		String a5="gaware";
		String a6="mahesh";
		String a7="velocity";
		String a8="city";
		String a9="MANUAL TESTING";
		String a10="MAHESH GAWARE";
		
		
	
		//TO GET SIZE/LENGTH
		System.out.println(a1.length());
		
		int aa=a2.length();
		System.out.println(aa);
		
		//TO VERIFY OBJECT IS EMPTY OR NOT 
		System.out.println(a1.isEmpty());
		System.out.println(a4.isEmpty());
		
		//TO CONVERT TO UPPERCASE
		System.out.println(a1.toUpperCase());
		System.out.println(a2.toUpperCase());
		System.out.println(a5.toUpperCase());
		
		//TO CONVERT TO LOWERCASE
		System.out.println(a2.toLowerCase());
		System.out.println(a3.toLowerCase());
		
		//COMPARE a1 and a2
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a6));
		
		//COMPARE a1 and a2
		System.out.println(a1.equalsIgnoreCase(a2));
		
		//COMPARE a7 and a8
		System.out.println(a7.contains(a8));
		
		//TO GET SINGLE CHARACTER
		System.out.println(a7.charAt(4));
		System.out.println(a1.charAt(2));
		System.out.println(a5.charAt(4));
		
		//TO VERIFY STRING a1,a5,a7 STARTS WITH "ma","ga","ve" RESPECTIVELY
		System.out.println(a1.startsWith("MA"));   //FALSE
		System.out.println(a1.startsWith("ma"));   //TRUE
		System.out.println(a5.startsWith("ga"));   //TRUE
		System.out.println(a7.startsWith("VE"));   //FALSE
		System.out.println(a7.startsWith("ve"));   //TRUE
		
		//TO VERIFY STRING a1,a5,a7 ENDS WITH "sh","re","ty" RESPECTIVELY
		System.out.println(a1.endsWith("SH"));   //FALSE
		System.out.println(a1.endsWith("sh"));   //TRUE
		System.out.println(a5.endsWith("re"));   //TRUE
		System.out.println(a7.endsWith("ty"));   //TRUE
		
		//TO GET INDEX OF CHARACTER
		System.out.println(a1.indexOf('e'));
		System.out.println(a7.indexOf('i'));
		System.out.println(a5.indexOf('a'));
		
		//TO GET INDEX OF LAST CHARACTER
		System.out.println(a1.lastIndexOf('s'));
		System.out.println(a5.lastIndexOf('a'));
		
		//TO GET SUBSTRING
		System.out.println(a1.substring(2));
		System.out.println(a7.substring(4));
		
		//TO GET SUBSTRING
		System.out.println(a7.substring(0, 4));
		System.out.println(a5.substring(2, 6));
		
		//TO CONCAT a1 and a5 
		System.out.println(a1+" "+a5);    //OR
		System.out.println(a1.concat(a5));
		
		//TO REPLACE 
		System.out.println(a9.replace("MANUAL", "AUTOMATION"));
		System.out.println(a10.replace("GAWARE", "gaware"));
		
		
		
		
	}
	
	
	
	
	
}
