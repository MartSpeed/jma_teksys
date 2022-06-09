package employee;

public abstract class EmployeeReport {

    // contain at least one abstract method
    public abstract void displayEmpData();

    // concrete method
    public void displayHeading(){
        System.out.println("ABC Engineering");
    }
}
