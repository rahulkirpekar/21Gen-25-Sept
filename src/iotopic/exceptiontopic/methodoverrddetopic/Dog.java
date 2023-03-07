package exceptiontopic.methodoverrddetopic;

import java.io.IOException;

public class Dog extends Animal
{
	@Override
	public void eat() throws IOException
	{
		System.out.println("Dog--eat()");
	}
}
