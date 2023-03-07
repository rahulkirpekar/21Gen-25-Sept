package oops.statictopic;

import java.util.Scanner;
public class Student 
{
	int rno;// Per Object Memory Allocation
	String name;// Per Object Memory Allocation
	int std;// Per Object Memory Allocation
	static String schoolName;// ClassLevel Memory Allocation
	public static void setSchoolName() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SchoolName : ");
		schoolName = sc.nextLine();
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " +std + " " +schoolName);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName();
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
}
