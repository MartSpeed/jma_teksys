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
