package Main;

public class Main {

	public static void main(String[] args) {
		// we can create a new employee in the main class
		// arguments need to be inserted in the same order as they are created in the
		// Employee class
		
		Employee empOne = new Employee("Albedo", "Palazzo", 98765, "Hero");
		empOne.withdraw(200,50);
		Employee empTwo = new Employee("Musasibou", "Oda", 44556, "Super Hero");
		Employee empThree = new Employee("Power","Hawk", 00000, "Hidden Savior");
		Manager managerOne = new Manager("Vynarius", "Indignation", 19735, "World Boss", "Sales Timecards");
		managerOne.PrintThis(1,2,4,5,8,5,7895,95,23485,45,4,5,8,9*7,6);
		/*
		 * empOne.setFirstName("Abraxxas"); System.out.println(empOne);
		 * System.out.println(empTwo); System.out.println(empThree);
		 * System.out.println(managerOne);
		 */
		
		// instantiate the generic
		// new creates space for it
		Box<Integer> intBox = new Box<Integer>();
		// variable reference
		intBox.add(234);
		intBox.add(889);
		intBox.add(678);
		intBox.add(337);
		
		// get method that we created
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		strBox.add("Albedo");
		strBox.add("Abraxxas");
		strBox.add("Babbage");
		
		System.out.println(strBox.get());
		
		String str = "CHECKING";
		Accounts accOne =  new Accounts(AccountTypes.valueOf(str));		
		accOne.chooseAccounts();
		
		str = "SAVINGS";
		Accounts accTwo =  new Accounts(AccountTypes.valueOf(str));		
		accTwo.chooseAccounts();
		
		str = "CREDIT";
		Accounts accThr =  new Accounts(AccountTypes.valueOf(str));		
		accThr.chooseAccounts();
		
		ExampleClass.NestedClass.hello();
	}

}