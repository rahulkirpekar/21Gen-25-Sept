package exceptiontopic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans=0;
		// Exception Handle --- try...catch
		try 
		{
			// raise exception code
			try 
			{
				ans = no1/no2;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		
			try 
			{
				String name = "royal";
				System.out.println("name.length() - " + name.length());

			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			try 
			{
				int a[] = new int[5];//a[0],a[1],a[2],a[3],a[4]
				a[5]=10;
				System.out.println(a[5]);

			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}catch(Exception e) 
		{
			System.out.println("Exception Handled throgh --- Catch Block");
			e.printStackTrace();
		}
		
		System.out.println("Addition : " + ans);
	}
}
