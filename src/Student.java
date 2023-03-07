//Object -- Cosmic Super Class
public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	// Default Constructor
	Student()
	{
			System.out.println("START :: DEFAULT Constructor");
			rno=1;
			name="rahul";
			std=12;
			System.out.println("EXIT :: DEFAULT Constructor");
	}
	// Para Constructor
	Student(int r,String n)
	{
			System.out.println("START :: Two--PARA Constructor");
			rno = r;
			name = n;
			System.out.println("EXIT :: Two--PARA Constructor");

	}
	Student(int r,String n,int s)
	{
			System.out.println("START :: Three--PARA Constructor");
			rno = r;
			name = n;
			std = s;
			System.out.println("EXIT :: Three--PARA Constructor");

	}
	Student(Student s)
	{
			System.out.println("START :: COPY-PARA Constructor");
			rno = s.rno;
			name = s.name;
			std = s.std;
			System.out.println("EXIT :: COPY-PARA Constructor");

	}
	public void disp() 
	{
		System.out.println(rno + " "+ name +  " " + std  + " -- " + this);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student(2,"Krunal",12);
		Student s3 = new Student(3,"Ravi");
		
		s1.disp();
		s2.disp();
		s3.disp();
		
		Student s4 = new Student(s2);

		s4.disp();
		
		System.out.println("s1 -- " + s1);// fullQual.ClassName@HexaString(HashCode)
		System.out.println("s2 -- " + s2);// fullQual.ClassName@HexaString(HashCode)
		System.out.println("s3 -- " + s3);// fullQual.ClassName@HexaString(HashCode)
		System.out.println("s4 -- " + s4
				);// fullQual.ClassName@HexaString(HashCode)

	}
}


