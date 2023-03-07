package exceptiontopic;

// User Defined Exception/ Custom Exception  ---> Checked Exception
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}

