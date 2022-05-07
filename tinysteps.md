# Anthony's Epic

> # Model Class Task

- [x] complete fields
- [x] complete constructors

> ## private fields

- [x] private String itemName; // name of the item
- [x] private String itemDesc; // description of the item
- [x] private Double itemPrice; // price of the item
- [x] private Integer quantity; // the number of items the user has added to the cart
- [x] private availableQuantity; // represents the available item type available in the system

> ## sample.txt and TheSystem Task

- [x] sample.txt contains data in "double space" separated format
- [x] TheSystem should contain the private instance variable associated with the getters and setters
- [x] system should maintain the list of items and the main logic
- [x] create itemCollection Hashmap<String, Item>

  ```
  // Creates the list map for key/value pairs
  HashMap<String, Item> itemCollection = new HashMap<String, Item>();

  	HashMap<String, Item> itemCollection = new HashMap<String, Item>();

  TheSystem() {
  	// create new hashMap<> object to map key value pairs
  	itemCollection = new HashMap<String, Item>();
  	//
  	if(getClass().getSimpleName().equals("App System")) {
  		// try/catch code block for exception handling
  		try {
  			FileReader file = new FileReader(new File("src\\sample.txt"));
  			// Scanner to read file
  			Scanner fileScan = new Scanner(file):
  			// while looking for the next line
  				while(fileScan.hasNextLine()) {
  					String[] itemInfo = fileScan.nextLine().split("  ") // split files using a double space
  					Item icoItem = Item(); // variable for new local Item()
  					icoItem.setItemName(itemInfo[0]); // set local variable to key pair
  					icoItem.setItemName(itemInfo[1]); // set local variable to value pair
  					icoItem.setItemPrice(Double.valueOf(itemInfo[2]));
  					icoItem.setAvailableQuantity(Integer.valueOf(itemInfo[3]));
  					itemCollection.put(icoItem.getItemName(), icoItem)
  				}
  			// close the scanner
  			fileScan.close();

  		}catch(FileNotFoundException ex) {
  			System.err.println("Something went wrong and couldnot load item list file.");
  			ex.printStackTrace();
  		}
  	}

  }
  ```

> ## [x] constructor that initializes the itemCollection

```
// default constructor
public ItemCollection() {

}

 public HashMap<String, Item> getItemCollection(){
        // Your code here
        this.itemCollection = itemCollection();

    }
```

> ### [x] create checkAvailability() method

```
		// METHOD:  checks that the quantity is less then or equal to availableQuantity
	public Boolean checkAvailability(Item item) {
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + ". System only has "
					+ item.getAvailableQuantity() + item.getItemName() + "'s.");
			return false;
		} else {
			return true;
		}
	}
```

> ## [x] create collection.add() method

```
// METHOD: increase quantity by one
	public Boolean add(Item item) {
		// if item is null, if it does not exists!
		if(item == null) {
			// check to see if the item is available
			//if it exists, increase the count by 1
			if(itemCollection.containsKey(item.getItemName()) && checkAvailability()) {
				int quantIncOne = item.getQuantity() + 1;
				// set the count to be added
				item.setQuantity(quantIncOne);
				// update the new count inside of the collection map
				itemCollection.replace(item.getItemName(), item);
			}

		}
	}
```

> ## [x] create the collection.remove() method

```
// checks to see if the itemName exists
// if it does then it will remove itemName from collection
// if not in collection, returns null
public Item remove(String itemName) {
return this.itemCollection.remove(itemName);
}

```

> ## App Class Task
>
> ## [x] create the display() method
>
> - [x] OUTPUT: 1. Name: itemName, displayed as a left-justified string within a 20 character field.
> - [x] OUTPUT: 2. Description: itemDesc, displayed as a left-justified string within a 20 character field.
> - [x] OUTPUT: 3. Price: itemPrice, displayed as a left-justified string within a 10 character field.
> - [x] OUTPUT: 4. Available Quantity: availableQuantity, displayed as a left-justified string within a 10 character field.

```
@Override
	public void display() {
		// this method takes no params and displays every item in the App System

		// get the items we need with HashMap<Key, Value> pair
		HashMap<String, Item> items = getItemCollection();

		// to do this we need to you the sysout formatter to create the table order
		System.out.printf("%-20s %-20s %-10.2f %-10d%n", "Name", "Description", "Price", "Available Quantity");

		// for of loop to take each item entry and display the collection method
		// set each entry to the table in the correct order
		items.entrySet().forEach(entry -> {
			Item disItem = entry.getValue();

			// Name, Description, Price, Available Quantity
			// use the sysout format to use the format methods
			System.out.printf("%-20s %-20s %-10.2f %-10d%n", disItem.getItemName(), disItem.getItemDesc(),
					disItem.getItemPrice(), disItem.getAvailableQuantity());

		});
	}
```

> ## [x] create the add() method

- [x] if item is null, return false;
- [x] if it is already in the collection, displays a message
  - [x] message: "[item name] is already in the App System" and return false
- [x] if the item is not in the collection, the method adds the item object
  - [x] in no in collection, return null

```
	@Override // this overwrites the parents class add method
	public Boolean add(Item item) {
		// this item takes item object as a param
		// 1. [] if item is null, it returns false
		if (item != null) {
			// check for existing item in hashMap by the key value
			// containsKey() took me FOREVER TO FIND and realized how to better see the
			// question
			// the key value is called INSIDE of the containKey method :facepalm:
			if (getItemCollection().containsKey(item.getItemName())) {
				// print out the statement
				// "[item name] is already in the App System"
				// returns false
				System.out.println(item.getItemName(), item);
				return false;
			} // if item in NOT in the collection
				// method adds the item to the collection
				// returns true
			else {
				// BRTURE FORCE need to ask question
				getItemCollection().put(item.getItemName(), item);
				return true;
			}
		} else {
			// if item is null, returns false END
			return false;
		}
	}
```

> ## [x] create the reduceAvailableQuantity() method

- [x] takes in a String itemName
- [x] checks if the item is in the collection
  - [x] if it does, decrease the availableQuantity() - 1
  - [x] then returns the item object
- [x] if ihe item is not in the collection, return null

```
	public Item reduceAvailableQuantity(String item_name) {
		// takes String itemName as a param
		// checks if it is in the collection
		// if true, reduces he availableQuantity by 1 and returns object
		// if item not in collection, return null
		if (getItemCollection().containsKey(item_name)) {
			// get item name,if item exist
			Item colItem = getItemCollection().get(item_name);
			// if it exits reduce availableQuantity by 1
			colItem.setAvailableQuantity(colItem.getAvailableQuantity() - 1);
			// if item not on collection, return null
			if (colItem.getAvailableQuantity() <= 0) {
				// DING DING DING QUESTION TIME!!!: i do not follow why this logic works
				// why am i removing the item if the quantity is <=0 or null?
				getItemCollection().remove(item_name);
				return colItem;
			}
			// DING DING DING QUESTION TIME!!!: I need to inquire about this further, it
			// made sense when i did it
			// drops the item by 1 and returns the itemName and returns the object???
			getItemCollection().replace(item_name, colItem);
			return colItem;
		} else { // return null if not in the collection
			return null;
		}
	}
```
