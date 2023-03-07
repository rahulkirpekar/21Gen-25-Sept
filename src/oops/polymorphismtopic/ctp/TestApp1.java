package oops.polymorphismtopic.ctp;

public class TestApp1 
{
	public static void addFun(int no1,long no2) 
	{
		System.out.println("long --- no1 + no2 - " + (no1 + no2));
	}
	public static void addFun(long no1,int no2) 
	{
		System.out.println("float --- no1 + no2 - " + (no1 + no2));
	}
	public static void main(String[] args) 
	{
		TestApp1.addFun(10L, 20L);//C.E
	}
}
// 1) method argument count
// 2) method same argument --- same type
// 3) method 
