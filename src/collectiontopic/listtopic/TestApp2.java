package collectiontopic.listtopic;
import java.util.ArrayList;
import java.util.ListIterator;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "krunal", 12);
		Student s3 = new Student(3, "rakesh", 12);
		Student s4 = new Student(4, "ankur", 12);
		Student s5 = new Student(5, "sagar", 12);
		ArrayList<Student>list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
//		Iterator<Student>itr =	list.iterator();
//		while(itr.hasNext()) 
//		{
//			Student s = itr.next();
//			s.disp();
//		}

		ListIterator<Student>itr =	list.listIterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		System.out.println("Backward Direction : ");
		
		while(itr.hasPrevious()) 
		{
			Student s  = itr.previous();
			s.disp();
		}
	}
}
