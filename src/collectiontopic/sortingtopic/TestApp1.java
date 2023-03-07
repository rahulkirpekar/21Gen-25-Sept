package collectiontopic.sortingtopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// names---string---names
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("rahul");
		names.add("ankur");
		names.add("rakesh");
		names.add("ramesh");
		names.add("brijesh");
		names.add("sagar");
		names.add("ankur");
		
		Iterator<String> itr = 	names.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
			
		}
		System.out.println("After Sorting : ");
		Collections.sort(names);
		
		itr = 	names.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
			
		}
	}
}
