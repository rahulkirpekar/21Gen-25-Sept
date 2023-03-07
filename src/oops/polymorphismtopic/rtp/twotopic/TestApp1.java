package oops.polymorphismtopic.rtp.twotopic;
public class TestApp1 
{
	public static void main(String[] args) 
	{
//		Parent ReferenceVariable = new ChildObject();
		// Polymorphic Object - UpCasting - Parent refernce--child object
		Vehicle vehicle = new LmvUser();
		vehicle.getSpec();
//		vehicle.getTwSpecFeatures();// C.E
		if(vehicle instanceof TwUser) // true
		{
			TwUser twUser = (TwUser)vehicle;
			twUser.getTwSpecFeatures();
		}else if(vehicle instanceof LmvUser) // true
		{
			LmvUser lmvUser = (LmvUser)vehicle;
			lmvUser.getLmvSpecFeatures();
		}
//		((TwUser)vehicle).getTwSpecFeatures();
	//		vehicle = new HmvUser();
//		vehicle.getSpec();

//		vehicle = new LmvUser();
//		vehicle.getSpec();
		
//		TwUser twUser = new TwUser();
//		twUser.getSpec();
//		LmvUser lmvUser=new LmvUser();
//		lmvUser.getSpec();
//		HmvUser hmvUser = new HmvUser();
//		hmvUser.getSpec();
	}
}