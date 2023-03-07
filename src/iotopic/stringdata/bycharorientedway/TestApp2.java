package iotopic.stringdata.bycharorientedway;
import java.io.FileReader;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try (
				FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\charoriented.txt");
			)
		{
			int temp;
			while ((temp = fr.read())!=-1) 
			{
				sb.append((char)temp);
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.print("Final String -- " + sb);
	}
}