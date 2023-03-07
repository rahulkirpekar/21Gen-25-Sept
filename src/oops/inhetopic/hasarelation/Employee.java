package oops.inhetopic.hasarelation;
import java.util.Scanner;
public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	private String orgName;
	private Address address = null;
	public Employee(int id, String name, int salary, String dsgn, String orgName, Address address) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
		this.address = address;
	}
	public void disp() 
	{
		System.out.print(id + " "+ name + " "+ salary + " " + dsgn + " "+ orgName + " ");
		address.disp();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter StreetName : ");
		String streetName= sc.nextLine();
		System.out.println("Enter areaName : ");
		String areaName= sc.nextLine();
		System.out.println("Enter cityName : ");
		String cityName= sc.nextLine();

		Address rahulAddress = new Address(streetName, areaName, cityName, "GUJ", "IND", "23452134", "213413246", "31246789");
		Employee rahulEmp = new Employee(id, name, 1221, "SE", "abc", rahulAddress);
		rahulEmp.disp();
	}
}