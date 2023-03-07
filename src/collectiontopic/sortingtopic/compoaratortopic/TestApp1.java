package collectiontopic.sortingtopic.compoaratortopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import collectiontopic.sortingtopic.comparabletopic.SalaryWiseEmployeeComparator;
import collectiontopic.sortingtopic.comparabletopic.Student;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "rahul", 1222, "SE", "abc");
		Employee e2 = new Employee(2, "ankur", 2345, "CA", "infosys");
		Employee e3 = new Employee(3, "rakesh", 8976, "DR", "royal");
		Employee e4 = new Employee(4, "brijesh", 6756, "SE", "Microsoft");
		Employee e5 = new Employee(5, "sagar", 3456, "Administrator", "google");

		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Iterator<Employee> itr  = list.iterator();
		while(itr.hasNext())
		{
			Employee e = 	itr.next();
			e.disp();
		}
		
		Collections.sort(list, new SalaryWiseEmployeeComparator());

		System.out.println("\n\nAfter SalaryWise Sorting : \n");
		itr  = list.iterator();
		while(itr.hasNext())
		{
			Employee e = 	itr.next();
			e.disp();
		}
		
		
		
		
		Collections.sort(list, new DsgnWiseEmployeeComparator());

		System.out.println("\n\nAfter DsgnWise Sorting : \n");
		itr  = list.iterator();
		while(itr.hasNext())
		{
			Employee e = 	itr.next();
			e.disp();
		}
		
		
		
		Collections.sort(list, new OrgNameWiseEmployeeComparator());

		System.out.println("\n\nAfter OrgNameWise Sorting : \n");
		itr  = list.iterator();
		while(itr.hasNext())
		{
			Employee e = 	itr.next();
			e.disp();
		}
	}
}
