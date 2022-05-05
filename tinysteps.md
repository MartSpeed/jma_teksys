# Anthony's Epic

## Model Class Task

- [x] complete fields
- [x] complete constructors

### private fields

- [x] private String itemName; // name of the item
- [x] private String itemDesc; // description of the item
- [x] private Double itemPrice; // price of the item
- [x] private Integer quantity; // the number of items the user has added to the cart
- [x] private availableQuantity; // represents the available item type available in the system

---

### constructor

- [x] this constructor initializes quantity to 1
- [x] initializers all fields

---

## sample.txt and TheSystem Task

---

- [] sample.txt contains data in "double space" separated format
- [] TheSystem should contain the private instance variable associated with the getters and setters
- [] system should maintain the list of items and the main logic
- [x] create itemCollection Hashmap<String, Item>

  ```
  HashMap<String, Item> itemCollection = new HashMap<String, Item>();
  ```

## [x] constructor that initializes the itemCollection

```
// default constructor
public ItemCollection() {

}

 public HashMap<String, Item> getItemCollection(){
        // Your code here
        this.itemCollection = itemCollection();

    }
```

## [x] create checkAvailability() method

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

- [x] create add() method

- [] create remove() method

```
File file = new File("sample.txt");
	Scanner scan = new Scanner(file);
```

---

```
itemCollection.put("sample.txt", file);
```

## [] create add() method

```

```
