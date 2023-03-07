package iotopic.stringdata.bybyteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 1) String Data:- 
// 		----> Byte Oriented Way[write/read] :- FileOutputStream(C)
public class TestAppWrite1 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();//ABCD
		
		byte b[] = name.getBytes();// A-65,B-66,C-67,D-68
		
		FileOutputStream fout = null;
		try 
		{
			fout = new FileOutputStream("test1.txt");
			
			fout.write(b);
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Success writting");
	}
}
