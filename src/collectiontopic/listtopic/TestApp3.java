package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// list--- int values
		ArrayList<Integer>list = new ArrayList<Integer>();
				     //  "AUTO Boxing Rule"  
		list.add(10);// Primitive Values----->(WrapperClass)Object
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Iterator<Integer> itr =	list.iterator();
		while(itr.hasNext()) 
		{
			//  "UnBoxing Rule"
			// Object to Primitive variable 
			int no = itr.next();
			System.out.println(no);
		}
	}
}
