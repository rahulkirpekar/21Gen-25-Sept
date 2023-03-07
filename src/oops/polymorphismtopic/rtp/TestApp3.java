package oops.polymorphismtopic.rtp;

class A
{
}
public class TestApp3 extends A
{
	public static void main(String[] args) 
	{
		A app = new TestApp3();
		System.out.println(app + " "+ app.getClass().getName());

		
	}
}
