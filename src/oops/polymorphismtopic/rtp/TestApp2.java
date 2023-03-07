package oops.polymorphismtopic.rtp;
import java.util.Scanner;
public class TestApp2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type of Vechile  : ");
		System.out.println("1) For TwUser");
		System.out.println("2) For LmvUser");
		System.out.println("3) For HmvUser");
		int typeofVehicle = sc.nextInt();
		Vehicle vehicle = null;
		switch(typeofVehicle) 
		{
				case 1 : vehicle = new TWUser();
						 vehicle.getUserByVehicleType(vehicle);
						 break;
				case 2 : vehicle = new LmvUser();
				 		 vehicle.getUserByVehicleType(vehicle);
				 		 break;
				case 3 : vehicle = new HmvUser();
				 		 vehicle.getUserByVehicleType(vehicle);
				 		 break;
		}
	}
}