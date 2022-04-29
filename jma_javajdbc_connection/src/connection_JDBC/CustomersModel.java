package connection_JDBC;

public class CustomersModel {
	// creating a customer query DAO
	// create customer connections
	// information we want to grab
	// queryString = "SELECT city FROM customers WHERE city = "New Haven"";
	
	
	int customerNumber; // customer number int query
	String contactFirstName, contactLastName, city, state, country; // customer string query
	
	//constructor and fields
	public CustomersModel() {
		
	}
	
	//constructor with fields
//	public CustomersModel(int customerNumber, String firstName, String lastName, String city, String state, String country) {
//		//this.method
//		this.customerNumber = customerNumber;
//		this.contactFirstName = contactFirstName;
//		this.contactLastName = lastName;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//	}
	
	
	public CustomersModel(int customerNumber, String contactFirstName, String contactLastName, String city,
			String state, String country) {
		super();
		this.customerNumber = customerNumber;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	//***GETTERS/SETTERS START***

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	//***GETTERS/SETTERS END***
}
