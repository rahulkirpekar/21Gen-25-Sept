package stringtopic.stringmethods.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name1 = "royal";
//		String name2 = name1.concat(" techno");
//		System.out.println(name1.hashCode() + " " + name2.hashCode());
//-----------------------------------------------------------------------------
		StringBuilder sb = new StringBuilder("abcdefgh");
//		StringBuffer sb = new StringBuffer("Royal");//-- MultiThreadding Concept---implement --application

		System.out.println(sb + " " +sb.hashCode());
//		sb.append(" Technosoft");
//		System.out.println(sb + " " +sb.hashCode());

		System.out.println(sb.reverse() + " " + sb.hashCode());
		
	}
}
