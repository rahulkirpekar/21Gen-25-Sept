package oops.inhetopic.isarelation_inheritance;
/*
Animal---eat()
  |
 Dog---bark
  |
BabyDog---weep
*/
public class TestApp2 
{
	public static void main(String[] args) 
	{
		BabyDog babyDog = new BabyDog();
		
		babyDog.weep();
		babyDog.bark();
		babyDog.eat();
	}
}
