package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "krunal", 5);
		Student s3 = new Student(3, "rakesh", 11);
		Student s4 = new Student(4, "ankur", 10);
		Student s5 = new Student(5, "ramesh", 7);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);//0
		list.add(s2);//1
		list.add(s3);//2
		list.add(s4);//3
		list.add(s5);//4

		int searchRno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno which you want to update : ");
		searchRno = sc.nextInt();
		boolean flag=false;
		Student s = null;
		int i;
		for(i=0 ;i<list.size();i++) 
		{
			 s = list.get(i);
			if(searchRno==s.rno)
			{
				System.out.println("Records found in List Object----");
				flag= true;// i-- 
				break;
			}
		}
		if(flag) 
		{
			list.remove(i);
//			s.update();// rno---name std
//			list.set(i, s);
			System.out.println("Recors suucessfully Updated in List Object.");
		}else 
		{
			System.out.println("Given rno not found in List records");
		}
		
		for(i=0;i<list.size();i++) 
		{
			s = list.get(i);
			System.out.println(s.rno + " "+s.name +" " +s.std);
		}
		
		
		
		// Student Management Application
//  		1) insert---add
//			2) update---set(index,newObject)
//			3) delete---remove(index)
//			4) display all records---iterator
//		    5) searching ----

		
		
	}
}
