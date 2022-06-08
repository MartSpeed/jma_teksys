package ABCEmployee;

import ABCEmployee.Employee;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Anthony", 0, "Atlanta");
        // employee.setName("Anthony");
        // employee.setId(0);
        // employee.setCity("Atlanta");
        employee.display();
    }

}
