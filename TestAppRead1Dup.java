package iotopic.stringdata.bybyteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestAppRead1 
{
	public static void main(String[] args) 
	{
		int wc = 1;
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\test1.txt");
			int temp;// Byte Value
			
			while(	(temp = fin.read())	 != -1) 
			{
				if(temp==32) 
				{
					wc++;
				}
				char value = (char)temp;
				sb.append(value);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb + " Total Words : " + wc);
	}
}
