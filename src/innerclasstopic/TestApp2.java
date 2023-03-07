package innerclasstopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		Dog dog = new Dog();
//		dog.eat();
		// Abstract Class--->Annoumous Inner Class
		Animal animal = new Animal() 
		{
			// JVM---->TestApp2$1
			@Override
			public void eat() 
			{
				System.out.println("Dog--eat()--->"+this);
			}
		};
		animal.eat();
	}
}
