package iotopic.stringdata.bycharorientedway;

import java.io.FileWriter;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		FileWriter fw;
		try 
		{
			fw = new FileWriter("listodd.txt",true);
			for (int i = 1; i <=50; i++) 
			{
				if(i%2==1) 
				{
					fw.write(i);
				}
			}
			fw.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
