package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul", 12);
		//int a[] = new int[5];
		
		// Dynamic Array
		ArrayList listObj = new ArrayList();
		listObj.add(true);// 0 <====itr boolean---Boolean---(true)object
		listObj.add('R');// 1 <====itr 
		listObj.add("royal");// 2
		listObj.add(12);// 3
		listObj.add(534L);// 4
		listObj.add(43.43f);// 5
		listObj.add(65.534);// 6
		listObj.add(s); // 7

		System.out.println("listObj.size() - " + listObj.size());

//		System.out.println("listObj.get(0) - " + listObj.get(0));
		
//		for (int i = 0; i < listObj.size(); i++) 
//		{
//			Object obj = listObj.get(i);
//			System.out.println(obj);
//		}
		// 2----[Advanced for loop Version / Enhanced for / for-each loop] ---> normal for loop
//		for( Object obj : listObj) 
//		{
//			System.out.println(obj);
//		}
		// 3----Traditional way
		Iterator itr =	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
