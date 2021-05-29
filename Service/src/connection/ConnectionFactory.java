package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory{
	
	
	public Connection getConncetion() throws SQLException, ClassNotFoundException {
		
		String dbURL = "*********************";
		String username = "******************";
		String password = "******************";
		Class.forName("**********************");
		return DriverManager.getConnection(dbURL,username,password);
		
	}

}
