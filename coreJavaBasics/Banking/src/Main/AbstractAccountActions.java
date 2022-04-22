package Main;
/*Thursday April 21 2022
 * 
 * Abstraction
 * 	Interfaces
 * Polymorphism
 * Autoboxing
 * Generics
 * Type casting*/

// creating an abstract method
public abstract class AbstractAccountActions {
	private String bankAccount;
	
	// default constructor
	public AbstractAccountActions() {
		
	}
	
public AbstractAccountActions(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	// this is considered a method without a method body
	// an another class can override it
	abstract float withdraw(int amount, int withdrawAmount);
	abstract float deposit(int amount, int depositAmount);
	
	// method
	public String getBankAccount() {
		return bankAccount;
	}
}
