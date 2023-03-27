package jdbctopic.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection 
{
	// 2) Db Connection method
	public static Connection getConnection() 
	{
		FileInputStream fin=null;
		Properties prop = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21Gen(25)_Sept\\dbconfig.properties");
			prop = new Properties();
			prop.load(fin);
		} catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		 final String URLNAME     = prop.getProperty("URLNAME").trim();
		 final String DRIVERCLASS = prop.getProperty("DRIVERCLASS").trim();
		 final String USERNAME    = prop.getProperty("USERNAME").trim();
		 final String PASSWORD	  = prop.getProperty("PASSWORD").trim();
		
		Connection conn = null;
		try 
		{
			// 3) Load driver class
			Class.forName(DRIVERCLASS);
			
			// 4) pass credential into DriverManager's getConnection method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
