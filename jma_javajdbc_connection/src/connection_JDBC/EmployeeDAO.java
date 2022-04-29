package connection_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	// CREATE OUT DATABASE CALLS

	//
	Connection connection = null;
	
	// Prepared statement
	PreparedStatement ps = null;
	
	// result set
	ResultSet resultSet = null;

	// constructor
	public EmployeeDAO() {

	}

	// connect to our database
	public Connection getConnection() throws SQLException {
		
		//
		Connection conn;
		
		//
		conn = FactoryConnection.getInstance().getConnection();
		
		//
		return conn;
	}

	// grab the employee by ID
	public EmployessModel getEmployeebyId(int id) {
		
		// create space for new information
		EmployessModel employee = new EmployessModel();
		
		try {
			
			// queryString for database information
			String queryString = "SELECT * FROM employees";
			
			// grab the connection from:
			connection = getConnection();
			
			// variable set for the queryString
			ps = connection.prepareStatement(queryString);
			
			// variable set to execute the queryString
			resultSet = ps.executeQuery();
			
			// while loop to loop through the information we want to query?
			while (resultSet.next()) {
				
				// print out everything inside of the employee model
				System.out.println("Employee Number: " + resultSet.getInt("employeeNumber") + "First Name: "
						+ resultSet.getString("firstName") + resultSet.getString("lastName")
						+ resultSet.getString("jobTitle"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return employee;
	}

}
