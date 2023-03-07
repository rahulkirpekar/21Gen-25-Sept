package oops.abstrcationtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Rules rules = new Teachers();

		rules = new AdminStaff();
		
		rules = new Students();
		
		rules = new PrincipalCollage();		
		
		rules = new PrincipalSchool();
		
	}
}
