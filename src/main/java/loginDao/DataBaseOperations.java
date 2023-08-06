package loginDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseOperations {
	public static boolean validateUser(String name , String pass) throws ClassNotFoundException, SQLException
	
	{

		Connection con = ConnectDataBase.getConnection();
		
		
		 String query = "SELECT * FROM login WHERE uname = ? AND pass = ?";
         
         PreparedStatement preparedStatement = con.prepareStatement(query);
         preparedStatement.setString(1, name);
         preparedStatement.setString(2, pass);
         
         ResultSet rs = preparedStatement.executeQuery();

		
//		String query = "select * from login where uname="+name+" and pass="+pass+"";
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
		

		
		Boolean isvalid=rs.next();
		
		return isvalid;
		
		
	}
	

}
