package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() 
	{
		try {
			String userName = "root";
            String password = "0171";
            String url = "jdbc:mysql://localhost:3306/nasir";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            System.out.println("Attempting to connect to database");
            Connection con = DriverManager.getConnection (url, userName, password);
            return con;
		}
		catch(Exception ex)
		{
			System.out.println("Unable to connect to database.");
			System.out.println(ex.getMessage());
			return null;
		}
	}

}
