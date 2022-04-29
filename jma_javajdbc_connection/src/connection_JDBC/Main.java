package connection_JDBC;

public class Main {

	public static void main(String[] args) {
		// create new employee
		EmployeeDAO emp1 = new EmployeeDAO();
		// ???
		//EmployessModel empMod1 = new EmployessModel();
		
		//
		System.out.println(emp1.getEmployeebyId(1006));
//		
//		//create new customer connection?
		CustomersDAO cus = new CustomersDAO();
//		CustomersModel cusMod = new CustomersModel();
		System.out.println(cus.getAllByCity("'NYC'"));
		
		//System.out.println(cus.getAllCustomersId(0));	
		}

}
