package innerclasstopic.nestedclasstopic;

public class A 
{
	static int no = 200;
	// Nested Class
	static class B
	{
		void msg() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		 A.B obj = new A.B();
		
		 obj.msg();
	}
}
