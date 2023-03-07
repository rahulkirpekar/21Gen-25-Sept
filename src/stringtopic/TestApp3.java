package stringtopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name1 = new String("royal");
		String name2 = new String("royal");
		String name3 = name1;
		
//		System.out.println(name1==name2);// 
//		System.out.println(name1==name3);// true
		
		System.out.println(name1.equals(name2));// value
		System.out.println(name1.equals(name3));// value

		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.name.equals(s2.name));//
	
	
	}
}




