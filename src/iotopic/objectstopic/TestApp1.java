package iotopic.objectstopic;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		try (
				FileOutputStream fout = new FileOutputStream("21sept25.txt");
				// ObjectOutputStream
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s);
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
