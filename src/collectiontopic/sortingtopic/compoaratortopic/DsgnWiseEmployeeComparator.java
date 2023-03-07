package collectiontopic.sortingtopic.compoaratortopic;

import java.util.Comparator;

public class DsgnWiseEmployeeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		return (e1.getDsgn().compareTo(e2.getDsgn()));
	}

}
