package innerclasstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objb = objA. new B();
		
		objb.msg();
	}
}
