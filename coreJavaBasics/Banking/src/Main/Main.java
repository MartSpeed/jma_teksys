package Main;

public class Main {

	public static void main(String[] args) {
		// we can create a new employee in the main class
		// arguments need to be inserted in the same order as they are created in the
		// Employee class
		
		Employee empOne = new Employee("Albedo", "Palazzo", 98765, "Hero");
		Employee empTwo = new Employee("Musasibou", "Oda", 44556, "Super Hero");
		Employee empThree = new Employee("Power","Hawk", 00000, "Hidden Savior");
		Manager managerOne = new Manager("Vynarius", "Indignation", 19735, "World Boss", "Sales Timecards");

		empOne.setFirstName("Abraxxas");
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(managerOne);
		
	}

}