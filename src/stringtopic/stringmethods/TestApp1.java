package stringtopic.stringmethods;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name1 = "Royal";
//		String name2 = "techno";
//		name1 = name1.concat(name2);// RoyalTechno
//		name1 = name1+" "+name2;// RoyalTechno
//		System.out.println(name1);
		
//		String name="what do you know about me";  		
//		System.out.println(name.contains("o"));

		
//		String s1 = "aTdmin";  
//		System.out.println(s1.equalsIgnoreCase("ADMIN"));// 		
//		System.out.println(s1.endsWith("t"));  
//		System.out.println(s1.endsWith("test"));  

		
//		String name="sonoo";  
//		String sf1 = String.format("name is %s",name);  
//		String sf2 = String.format("value is %f",32.33434);  
//		String sf3 = String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  

		
//		String name = "abcde";

//		byte b[]   = name.getBytes();
		
		// b[0] -- 97
		// b[1] -- 98
		// b[2] -- 99
		// b[3] -- 100
		// b[4] -- 101
		
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.println(b[i] + " - " + name.charAt(i));
//		} 
		
//		String str = new String("hello javatpoint how r u");  
	    	//                   012345678901234567890123
//		char[] ch = new char[10];  
//	    str.getChars(6, 16, ch, 0);  
//	    System.out.println(ch);  
	    
		
		
		String s1="this is index of example";  
		//passing substring  

		int index1=s1.indexOf("is");//returns the index of is substring  // 2
		
		int index2=s1.indexOf("index");//returns the index of index substring //8 
		
		System.out.println(index1+"  "+index2);//2 8  
	}
}
