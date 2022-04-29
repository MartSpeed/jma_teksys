package connection_JDBC;
// connect our database to our java code template

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public class FactoryConnection {
	
	// locate database driver name
	String driverClassName = "com.mysql.jdbc.Driver";
	
	// locate database driver
	// SQL server connection
	// jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
	// MySQL connection string: "jdbc:mysql://localhost:3306/classicmodels" <- change name and location of DB here
	private final String url = "jdbc:mysql://localhost:3306/classicmodels";
	
	// root user
	private final String user = "root";
	
	// enter pw
	private final String pass = "********";
	
	//Connection conn = DriverManager.getConnection(url, user, pass);
	
	private static FactoryConnection factoryConnection = null; 
	
	private FactoryConnection() {
		
		try {
			
			// grabs the 
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(ClassNotFoundException e){
			
			System.out.println("Exception in FactoryConnection class");
			
			e.printStackTrace();
		}
	}
	
	// connect to our database
	public Connection getConnection() throws SQLException {
		
		Connection conn = null;
		
		conn = DriverManager.getConnection(url, user, pass);
		
		return conn;
	}
	
	public static FactoryConnection getInstance() {
		
		if(factoryConnection == null) {
			
			factoryConnection = new FactoryConnection();
			
		}
		
		return factoryConnection;
	}
}
