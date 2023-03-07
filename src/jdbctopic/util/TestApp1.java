package jdbctopic.util;

import java.sql.Connection;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getConnection();
		
		// 5) validate connection object
		if(conn != null) 
		{
			System.out.println("Db Connected : " +conn );
		}else 
		{
			System.out.println("Db not Connected : " +conn );
		}
	}
}
