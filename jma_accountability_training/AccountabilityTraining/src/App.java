import java.io.ObjectInputStream.GetField;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> people = getPeople();

        // Imperative Programming

        // new instance of object
        // List<Person> females = new ArrayList<>();

        // // loop for gathering all females
        // for (Person person : people) {
        //     if(person.getGender().equals(Gender.FEMALE)) {
        //         females.add(person);
        //     }
        // }

        // // loop to print out all female types
        // females.forEach(System.out :: println);

        // Declarative Programming

        // Filter METHOD BY GENDER
        //the initial collection that we want to start with
        List<Person> females = people.stream()
            .filter(person -> person.getGender().equals(Gender.FEMALE))
            .collect(Collectors.toList());

        //females.forEach(System.out :: println);

        // Sort METHOD BY AGE
        List<Person> sorted = people.stream()
            .sorted(Comparator.comparing(Person :: getAge).reversed())
            .collect(Collectors.toList());

        //sorted.forEach(System.out :: println);

        // All match
        //     // AGE > 5 true
        //     // AGE > 20 false
        // boolean allMatch = people.stream()
        //     .allMatch(person -> person.getAge() > 5);

        //     System.out.println(allMatch);

        // Any match
            // // AGE > 5 true
            // // AGE > 20 false
            // boolean anyMatch = people.stream()
            // .anyMatch(person -> person.getAge() > 121);

            // System.out.println(anyMatch);

        // None match
        // AGE > 5 true
            // AGE > 20 false
            boolean noneMatch = people.stream()
            .noneMatch(person -> person.getName().equals("Albedo"));

            //System.out.println(noneMatch);

        // Max
            // people with the MAX age
            people.stream()
                .max(Comparator.comparing(Person :: getAge))
                .ifPresent(System.out::println);

        // Min
        // people with the MIN age
        people.stream()
        .min(Comparator.comparing(Person :: getAge))
        .ifPresent(System.out::println);

        // Group
            // group information based on gender
        Map<Gender, List<Person>> groupByGender = people.stream()
            .collect(Collectors.groupingBy(Person::getGender));

            groupByGender.forEach((gender, people1) -> {
                System.out.println(gender);
                people1.forEach(System.out::println);
                System.out.println();
            });
    }

    // static list of people
    private static List<Person> getPeople() {
        return List.of(
            new Person("Monkey D. Luffy", 17, Gender.MALE),
            new Person("Roronoa Zoro", 19, Gender.MALE),
            new Person("Nami", 18, Gender.FEMALE),
            new Person("Usopp", 17, Gender.MALE),
            new Person("Sanji Vinsmoke", 19, Gender.MALE),
            new Person("Tony Tony Chopper", 15, Gender.MALE),
            new Person("Nico Robin", 28, Gender.FEMALE),
            new Person("Franky", 34, Gender.MALE),
            new Person("Brooke", 88, Gender.MALE),
            new Person("Jinbei", 44, Gender.MALE)
        );
    }
}
