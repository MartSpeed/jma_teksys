package Main;

// adding enums outside of the class
enum AccountTypes {
	// code block
	// enums are a constant value, constant values are in caps
	CHECKING, SAVINGS, CREDIT
}

public class Accounts {
	// reference to enums inside of your class
	AccountTypes accountTypes;

	// class constructor
	public Accounts(AccountTypes accountTypes) {
		super();
		this.accountTypes = accountTypes;
	}

	// method of choosing account typpes
	public void chooseAccounts() {
		switch (accountTypes) {
		// case is going to a reference to enums being passed it
		case CHECKING:
			System.out.println("You chose CHECKING");
			break;
		case SAVINGS:
			System.out.println("You chose SAVINGS");
			break;
		case CREDIT:
			System.out.println("You chose CREDIT");
			break;
		}
	}

}
