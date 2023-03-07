package collectiontopic.listtopic;

import java.util.LinkedList;
import java.util.Iterator;
public class TestApp5 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "krunal", 12);
		Student s3 = new Student(3, "ankur", 12);
		Student s4 = new Student(4, "rakesh", 12);
		Student s5 = new Student(5, "sagar", 12);
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Iterator<Student> itr =	list.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			Student s = (Student)obj;
			s.disp();
		}
	}
}
