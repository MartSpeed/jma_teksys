package ABCEmployee;

public class Employee {

    // FIELDS
    private String name;
    private int id;
    private String city;

    // EMPTY/ALL ARGS CONSTRUCTOR
    public Employee() {
        this.name = "";
        this.id = 0;
        this.city = "";
    }

    public Employee(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

    // CONSTRUCTORS START
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    // CONSTRUCTORS END

    // toString method
    @Override
    public String toString() {
        return "Employee [city=" + city + ", id=" + id + ", name=" + name + "]";
    }

    public void display() {
        System.out.println("Name: " + getName() + "\nID: " + getId() + "\nCity: " + getCity());
    }
}
