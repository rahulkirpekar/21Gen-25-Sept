package iotopic.stringdata.bycharorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		try (
				FileWriter fw = new FileWriter("charoriented.txt");
			)
		{
			fw.write(name);
			System.out.println("Success write");
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
