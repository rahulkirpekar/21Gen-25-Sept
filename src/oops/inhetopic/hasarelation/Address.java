package oops.inhetopic.hasarelation;
public class Address 
{
		 String streetName;
		 String areaName;
		 String cityName;
		 String stateName;
		 String countryName;
		 String pincode;
		 String contactno;
		 String permaContactno;
		public Address(String streetName, String areaName, String cityName, String stateName, String countryName,
				String pincode, String contactno, String permaContactno) 
		{
			this.streetName = streetName;
			this.areaName = areaName;
			this.cityName = cityName;
			this.stateName = stateName;
			this.countryName = countryName;
			this.pincode = pincode;
			this.contactno = contactno;
			this.permaContactno = permaContactno;
		}
		public void disp() 
		{
			System.out.print(streetName + " " + areaName + " " +cityName + " " +stateName + " " +countryName + " " +pincode + " " +contactno + " "+ permaContactno);
		}
}