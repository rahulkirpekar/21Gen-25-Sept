package stringtopic;

// String---java.lang
public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "technosoft";
		String name4 = name1;

//		name1 = name1.concat(" Technosoft Pvt Ltd.");
//		System.out.println(name1);// royal
		
		
//		System.out.println(name1==name2);// true
//		System.out.println(name1==name3);// false
//		System.out.println(name1==name4);// true
		

		System.out.println(name1.equals(name2));// true 
		System.out.println(name1.equals(name3));// false
		System.out.println(name1.equals(name4));// true

	}
}
