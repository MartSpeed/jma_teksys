package employee;

import employee.EmployeeReport;

public class Employee extends EmployeeReport {
    // declare 3 instance variables id, name, salary
    private int id;
    private String name;
    private double salary;

    // no args/all args constructor
    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters/setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // INHERITED FROM EMPLOYEEREPORT CLASS
    @Override
    public void displayEmpData() {
        // allow employee class to inherit both methods from the abstract class
        displayHeading();
        System.out.println("EMPLOYEE_ID: " + this.getId()
                + "\nEMPLOYEE_NAME: " + this.getName()
                + "\nEMPLOYEE_SALARY: $" + this.getSalary());
    }
}
