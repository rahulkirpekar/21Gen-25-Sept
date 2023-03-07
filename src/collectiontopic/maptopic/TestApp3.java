package collectiontopic.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// TreeMap---> Sorting ----> 'Ascending Order'
		TreeMap<Integer, String> namesMap = new TreeMap<>();
		namesMap.put(3, "ankur");
		namesMap.put(1, "rahul");
		namesMap.put(2, "krunal");
		namesMap.put(5, "rakesh");
		namesMap.put(4, "sagar");
		
		for(Map.Entry<Integer, String> e :	namesMap.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}
