package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import queries.SecretServiceQueries;
import repo.SecretRepo;

public class SecretService implements SecretRepo{
	
	
	private final ConnectionFactory connectionFactory = new ConnectionFactory();
	

	private String query;
	public String getQuery() {
		return this.query;
	}
	
	@Override
	public List<String> getSecretFilesUsingSecretCode(String secretCode) throws SQLException, ClassNotFoundException {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Connection connection =  connectionFactory.getConncetion();

		//query >> select * from secretfiles where secret_code = ' ';
		
		String query = SecretServiceQueries.secretFilesQuery + "'" + secretCode + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		
		
//		String query = SecretServiceQueries.secretFilesQuery + "?";
//		PreparedStatement statement = connection.prepareStatement(query);
//		statement.setString(1, secretCode);
//		ResultSet resultSet = statement.executeQuery();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		this.query =query;
		List<String> files = new ArrayList<>();
		while(resultSet.next()) {
			files.add(resultSet.getString("file_title") + "  " +resultSet.getString("file_description")+ " " + resultSet.getString("secret_code") );
		}
		resultSet.close();
		statement.close();
		connection.close();
		
		
		return  files;
		
	}

}
