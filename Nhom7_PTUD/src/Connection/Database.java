package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static Connection con= null;
	private static Database instance= new Database();
	public static Database getInstance()
	{ 
		return instance;
	}
	public void connect()
	{
		String url="";
		String user="";
		String password="";
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection()

	{
		return con;
	}
	
}
