package oops.constructordemo;
public class Student 
{
	private int rno;
	private String name;
	private int std;
	public Student() 
	{
		System.out.println("START :: Default Constructor");
		rno=1;
		name="rahul";
		std=12;
		System.out.println("EXIT :: Default Constructor");
	}
	public Student(int rno,String name) 
	{
		this();

		this.rno  = rno;
		this.name = name;
		System.out.println("EXIT :: TWO---PARA Constructor");
	}
	public Student(int rno,String name,int std) 
	{
		this(rno,name);
		this.std  = std;
		System.out.println("EXIT :: Three---PARA Constructor");
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std + " --- " + this);
	}
	public  void p(String s) 
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Student s = new Student(1,"rahul",12);
		System.out.println("s--> " + s);// s-- oops.constructordemo.Student@2626b418

		s.p("This is Java Language");
	}
}