package collectiontopic.sortingtopic.compoaratortopic;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgName;

	public Employee() 
	{
	}
	public Employee(int id, String name, int salary, String dsgn, String orgName) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDsgn() {
		return dsgn;
	}

	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public void disp() 
	{
		System.out.println(id + " "+name + " " + salary + " " +dsgn + " " +orgName);
	}
}
