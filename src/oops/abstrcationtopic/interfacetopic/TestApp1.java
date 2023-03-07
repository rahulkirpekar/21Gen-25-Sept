package oops.abstrcationtopic.interfacetopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter below choice : ");
		System.out.println("1) For Axisbank");	
		System.out.println("2) For SbiBank");	
		System.out.println("3) For BOB");	
		System.out.println("4) For Kotakbank");	
		int choice = new Scanner(System.in).nextInt();
		
		RbiBank bank = null;
		
		switch(choice) 
		{
			case 1 : bank = new AxisAhmBank();
					bank.test1();
					bank.test2();
					bank.test3();
					bank.test4();
					bank.test5();
					break;
			case 2 : 
					break;
			case 3 : 
					break;
			case 4 : 
					break;
									
		
		}
	
	
	}
}
