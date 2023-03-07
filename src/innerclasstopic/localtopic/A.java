package innerclasstopic.localtopic;
public class A 
{
	private int no = 100;
	void show() 
	{
		// Local InnerClass
		class B
		{
			void disp() 
			{
				System.out.println("No : " + no);
			}
		}	
		B obj = new B();
		obj.disp();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.show();
	}
}
