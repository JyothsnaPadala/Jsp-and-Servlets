package loginDao;
import java.sql.*;

public class ConnectDataBase {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/sys";
		String name ="root";
		String pass = "1234";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		  Connection con = DriverManager.getConnection(url,name,pass);
		  
		return con;
	}
	
		
}


