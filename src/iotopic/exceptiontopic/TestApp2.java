package exceptiontopic;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		try 
		{
			String name =null;
			System.out.println(name.length());
			a[5] = 10;
			System.out.println(a[5]);

		} catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}finally 
		{
			System.out.println("Hi I am Finally Block");
		}
	}
}
