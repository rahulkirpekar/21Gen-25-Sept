package collectiontopic.listtopic;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public Student() 
	{
		
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno + " " +name + " " +std);
	}
	@Override
	public String toString() 
	{
		return rno + " " +name + " "+std;
	}
	public void update() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
}
