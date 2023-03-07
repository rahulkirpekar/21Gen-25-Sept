package stringtopic;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		String name ="royal";
//					  01234	
		System.out.println(name.length());

		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println("name.charAt("+i+") : " + name.charAt(i));// r
		}
	} 
}
