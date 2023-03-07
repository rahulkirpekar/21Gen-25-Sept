package collectiontopic.sortingtopic.compoaratortopic;

import java.util.Comparator;

public class OrgNameWiseEmployeeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		return (e1.getOrgName().compareTo(e2.getOrgName()));
	}
}
