package iotopic.objectwriteread;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// object---data 
		Student sobj  = new Student(1, "rahul", 12);
		try(
				FileOutputStream fout = new FileOutputStream("studentlist.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(sobj);
			System.out.println("Student object successfully writting.");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
