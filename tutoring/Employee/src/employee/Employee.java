package employee;

import employee.EmployeeReport;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends EmployeeReport {
    // declare 3 instance variables id, name, salary
    private int id;
    private String name;
    private double salary;

    private int count = 0;

    // Scanner
    Scanner input = new Scanner(System.in);
    // ArrayList
    // ??? if we used a generic <?> here would we have to then name it Employee?
    ArrayList<Employee> empList = new ArrayList<>();

    // no args/all args constructor
    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void enterEmpData(){
        //
        while(count < 3) {
            System.out.println("Enter Identification");
            this.id = input.nextInt();
            System.out.println("Enter name");
            this.name = input.next();
            System.out.println("Enter Salary");
            this.salary = input.nextDouble();

            Employee emp = new Employee(id, name, salary);

            empList.add(emp);
            ++count;

            System.out.println(emp);
        }
    }

    //
    public void displayArrayList(){
        for(Employee emp: empList){
            System.out.println("\n" + emp);
        }
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
