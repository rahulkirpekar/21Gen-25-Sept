package oops.polymorphismtopic.rtp;

public class Vehicle 
{
	void getSpec() 
	{
		System.out.println("Vehicle -- getSpec()");
	}
	public void getUserByVehicleType(Vehicle vehicle) 
	{
		// instanceof - operator
		if (vehicle instanceof TWUser) 
		{
//			vehicle.getSpec();
			((TWUser)vehicle).getUserByVehicleType(vehicle);
//			TWUser twUser = (TWUser)vehicle;
//			twUser.getTwUserFeatures();
		} else if (vehicle instanceof LmvUser) 
		{
			LmvUser lmvUser= (LmvUser)vehicle;
			lmvUser.getLmvUserFeatures();
		}else if (vehicle instanceof HmvUser) 
		{
			HmvUser hmvUser= (HmvUser)vehicle;
			hmvUser.getHmvUserFeatures();
		}
	}
}