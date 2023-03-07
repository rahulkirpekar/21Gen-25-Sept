package oops.polymorphismtopic.ctp;

import java.util.Scanner;

// CompileTime-- Method Overloadding
public class Calc 
{
	// ZERO arg
	public static void addFun() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1+no2;
		System.out.println("ZEROArgs---Addition : " + ans);
	}
	// TWO arg
	public static void addFun(int no1,int no2) 
	{
		int ans = no1+no2;
		System.out.println("TWO---int Args---Addition : " + ans);
	}
	// TWO arg
	public void addFun(float no1,float no2) 
	{
		float ans = no1+no2;
		System.out.println("TWO---float Args---Addition : " + ans);
	}
	public static void main(String[] args) 
	{
//		Calc calc = new Calc();
		
//		Calc.addFun(10.324f,30.324f);
	}
}
