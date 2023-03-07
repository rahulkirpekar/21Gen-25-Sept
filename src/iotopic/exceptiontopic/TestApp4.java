package exceptiontopic;
import java.util.Scanner;
public class TestApp4 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{	
		if (age < 18) 
		{
			// Not Valid---	User PointOut --- throw --raise exception---user Exception MSG
			throw new InvalidAgeException("Invalid Age,\n\tPlease enter grater 18 age for Vote.");
		} else
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		try 
		{
			isValidForVote(age);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("After Catch block");
	}
}