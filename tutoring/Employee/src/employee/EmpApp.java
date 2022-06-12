package employee;

public class EmpApp {
    public static void main(String[] args){

        // create 2 employee objects and provide different data
        Employee empOne = new Employee(0,"Link", 777.67);
        Employee empTwo = new Employee(1, "Zelda", 9999.99);
        empOne.displayEmpData();
        empTwo.displayEmpData();

        Employee emp = new Employee();
        emp.enterEmpData();
        emp.displayArrayList();


    }
}
