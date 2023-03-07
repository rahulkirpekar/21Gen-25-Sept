package iotopic.stringdata.bybyteorientedway;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestStringByteWrite 
{
	public static void main(String[] args) 
	{
		// AutoClosable Resource WITH IO
		try(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\src\\iotopic\\stringdata\\bybyteorientedway\\TestAppRead1.java");
				FileOutputStream fout = new FileOutputStream("TestAppRead1Dup.java");	
			) 
		{
			int temp;
			while ((temp = fin.read()) != -1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
			System.out.println("Succcess read and write operation");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
