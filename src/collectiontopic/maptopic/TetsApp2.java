package collectiontopic.maptopic;

import java.util.LinkedHashMap;
import java.util.Map;
public class TetsApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion Order.
		LinkedHashMap<Integer, String> namesMap = new LinkedHashMap<Integer,String>();
		
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
