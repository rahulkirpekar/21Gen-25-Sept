package stringtopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "technosoft";
		
		System.out.println(name1 + " "+ name1.hashCode());

		System.out.println(name2 + " "+ name2.hashCode());
		
		name1 = name1.concat(name2);//
		
		System.out.println(name1 + " "+ name1.hashCode());

		System.out.println(name2 + " "+ name2.hashCode());
		
	}
}
