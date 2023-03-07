package innerclasstopic;

public class A 
{
	private int no = 100;
	// Member InnerClass
	class B
	{
		void msg() 
		{
			System.out.println("B -- msg() --- " + no);
		}
	}
}
