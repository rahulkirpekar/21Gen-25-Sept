package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class smapp 
{
	public static void main(String[] args) 
	{
		int choice = 0 ;
		Scanner sc = new Scanner(System.in);	
		ArrayList<Student> list = new ArrayList<Student>();

		while(choice!=5) 
		{
			System.out.println("Enter below choice "); 
			System.out.println("1) Insert");
			System.out.println("2) Update");
			System.out.println("3) Delete");
			System.out.println("4) display All records");
			System.out.println("5) For search by Name :");
			System.out.println("6) Exit");
			choice = sc.nextInt();
			switch(choice) 
			{
				case 1:  // Insert Student 
						 Student s = new Student();
						 s.scan();
						 list.add(s);
						 System.out.println("Student records successfully inserted in list object");
						break;
				case 2:
						System.out.println("Enter Rno which you want to update : ");
						int searchRno = sc.nextInt();
						boolean flag=false;
						s = null;
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
							s.update();// rno---name std
							list.set(i, s);
							System.out.println("Student Record suucessfully Updated in List Object.");
						}else 
						{
							System.out.println("Given rno not found in List records");
						}
					break;
				case 3:
						// delete by rno
						System.out.println("Enter Student Rno which you want to delete : ");
						int deleteRno = sc.nextInt();
						flag=false;
						int j = 0;
						for (; j < list.size(); j++) 
						{
							s = list.get(j);
							if(s.rno == deleteRno) 
							{
								flag = true;
								break;// i--2---student remove
							}
						}
						if(flag) 
						{
							list.remove(j);
							System.out.println("studnet record Successfully removed.");
						}else 
						{
							System.out.println("Given Student Rno not fount in Student List.");
						}
					break;		
				case 4:  Iterator<Student>itr =	list.iterator();
						while(itr.hasNext()) 
						{
							s = itr.next();
							s.disp();
						} 
						break;
						
				case 5:  sc.nextLine(); 
						 System.out.println("Enter Student Name : ");
						 String searchName = sc.nextLine();
						 flag=true;
						for (j=0; j < list.size(); j++) 
						{
							s = list.get(j);
							if(s.name.equals(searchName)) 
							{
								s.disp();
								flag = false;
								break;
							}
						}
						if(flag) 
						{
							System.out.println("Given Student Name not fount in Student List.");
						} 
						break;
				default:
					  System.out.println("Invalid Choice,\n\t Please enter between 1 to 5 choice.");
			}
		}
	}
}
