package collectiontopic.settopic;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Set - not allow duplicate values
		// HashSet - Hashing Algorithm
		TreeSet<String> nameList = new TreeSet<String>();
		nameList.add("rahul");//0 <===itr
		nameList.add("ankur");//1
		nameList.add("sagar");//2
		nameList.add("krishna");//3
		nameList.add("om");//4
		nameList.add("brijesh");//5
		nameList.add("ankur");//
		nameList.add("sagar");//
		nameList.add("krishna");//
		
		System.out.println("nameList.size() - " + nameList.size());

//HashSet Console Result:- 			    LinkedHashSet Result :-					TreeSet Result:-
//***************************   	    ***********************					****************
// ===> Not Maintain Insertion Order	 ===> Maintain Insertion Order			===> Ascending Order Sorting 	
//		ankur							rahul										ankur
//		rahul                       	ankur                                       brijesh
//		sagar                       	sagar                                       krishna
//		krishna                     	krishna                                     om
//		brijesh                     	om                                          rahul
//		om                          	brijesh                                     sagar

		Iterator<String> itr = 	nameList.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
