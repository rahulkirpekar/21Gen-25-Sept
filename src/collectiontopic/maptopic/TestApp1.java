package collectiontopic.maptopic;

import java.util.HashMap;
import java.util.Map;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// key    value---map---[HashMap,LinkedHashMap,TreeMap]
		// 1 --- sagar
		// 2----ankur
		HashMap<Integer, String> mapObj = new  HashMap<Integer, String>();
		
		mapObj.put(1, "Sagar");// Entry---[K,V]
		mapObj.put(2, "Ankur");// Entry---[K,V]
		mapObj.put(3, "Brijesh");// Entry---[K,V]
		mapObj.put(4, "Krunal");// Entry---[K,V]
		mapObj.put(5, "Rahul");// Entry---[K,V]
		
//		iterator---list,set,queue
//		listIterator---list
		
		for( Map.Entry<Integer,String>  e	: mapObj.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}