public class Person {
    // FIELDS

    private final String name;
    private final int age;
    private final Gender gender;

    // NO ARGS/ALL ARGS CONSTRUCTOR
    
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // GETTERS/SETTERS

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

    


    
}
