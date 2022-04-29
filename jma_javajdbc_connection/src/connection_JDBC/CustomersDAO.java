package connection_JDBC;

// import packages for drivers
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersDAO {
	// connection
	Connection connection = null;
	// Prepared statement
	PreparedStatement ps = null;
	// result set
	ResultSet resultSet = null;	
	
	
	// empty constructor
	public CustomersDAO() {
		
	}
		// connect to our database
		public Connection getConnection() throws SQLException {
			Connection conn;
			conn = FactoryConnection.getInstance().getConnection();
			return conn;
		}
		
		// grab the employee by ID
		public CustomersModel getCustomerbyId(int id) {
			
			// create space for new information
			CustomersModel customer = new CustomersModel();
			
			try {
				
				// queryString for database information
				String queryString = "SELECT * FROM customers";
				connection = getConnection();  // grab the connection from:
				ps = connection.prepareStatement(queryString);  // variable set for the queryString// variable set to execute the queryString
				resultSet = ps.executeQuery();  // variable set to execute the queryString
				
				// while loop to loop through the information we want to query?
				while (resultSet.next()) {
					
					// print out everything inside of the employee model
					System.out.println("Customer ID: " + resultSet.getInt("customerNumber") + "\n" + " \nName: "
							+ resultSet.getString("contactFirstName") + " " + resultSet.getString("contactLastName")
							+ " \nCity: " + resultSet.getString("city") + " ,State: " + resultSet.getString("state"));
					
					//System.out.println(resultSet.getInt("customerNumber"));
					
					
				}				
			} catch (Exception e) {				
				e.printStackTrace();				
			}			
			return customer;
		}

public CustomersModel getAllByCity(String city) {
			
			// create space for new information
			CustomersModel customer = new CustomersModel();
			
			try {
				
				// queryString for database information
				String queryString = "SELECT * FROM customers WHERE city=" + city;
				connection = getConnection();  // grab the connection from:
				ps = connection.prepareStatement(queryString);  // variable set for the queryString// variable set to execute the queryString
				resultSet = ps.executeQuery();  // variable set to execute the queryString
				
				// while loop to loop through the information we want to query?
				while (resultSet.next()) {

					
					System.out.println("Customer Number (" +resultSet.getInt("customerNumber") + ")" + "\n" + "Name: "
							+ resultSet.getString("contactLastName")
							+ ", " + resultSet.getString("contactFirstName")
							+ "\n" + resultSet.getString("city") + ", "
							+ resultSet.getString("state"));
					
					
				}				
			} catch (Exception e) {				
				e.printStackTrace();				
			}			
			return customer;
		}
}
