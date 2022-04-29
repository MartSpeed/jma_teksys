package connection_JDBC;

public class Main {

	public static void main(String[] args) {
		//
		EmployeeDAO emp1 = new EmployeeDAO();
		//
		EmployessModel empMod1 = new EmployessModel();
		
		//
		System.out.println(emp1.getEmployeebyId(1006));
	}

}
