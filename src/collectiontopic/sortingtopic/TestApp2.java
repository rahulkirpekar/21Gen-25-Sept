package collectiontopic.sortingtopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("ankur");
		list.add("rakesh");
		list.add("tanmay");
		list.add("brijesh");
		list.add("sagar");
		Iterator<String> itr =	list.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("After Sorting : ");
		Collections.sort(list);
		itr =	list.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
