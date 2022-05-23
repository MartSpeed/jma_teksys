# work flow

# GOAL
Add an item to the System: In this case, the system asks the user to enter the new item's name, a description for the new item, the new item’s price and the available quantity of the new item, finally, the new item will be added to the app.

# [] add an item in the system
> there was no MODEL class, but the information was closes inside of the item class
- [x] REQ 1
## fields
    - [x] private String itemName
    - [x] private String itemDesc
    - [x] private Double itemPrice
    - [x] private Integer availableQuantity
## constructors
- [x] empty constructor
- [x] constructor with args
    - [x] String itemName
    - [x] String itemDesc
    - [x] Double itemPrice
    - [x] Integer availableQuantity
- [] set initial quantity to 1
## getters/setters
- [x] itemName
- [x] itemDesc
- [x] itemPrice
- [x] quantity
- [x] availableQuantity
## toString
- [x] toString method

- [] REQ 2
## sample.txt
- [] sample.txt contains data in “double space” separated value format.
- [] System.out.printf() for formatted output value
    - [] double space
    - [] itemName
    - [] itemDesc
    - [] itemPrice
    - [] availableQuantity
## TheSystem Class
## fields
- [x] HashMap<String, Item> itemCollection
## constructors
- [x] empty constructor
    - [x] initializes the itemCollection
        - [x] Hashmap<String, Item> itemCollection = new HashMap<>();
        - [x] checks AppSystem Class to invoke if(getClass().getSimpleName().equals("AppSystem")) construtor
        - [] this is how you read the lines from the txt: String[] itemInfo = line.split("\s ");
        - [] if itemName === availableQuantity, add the items FROM the txt to the itemCollection
# TheSystem METHODS
## - [x] checkAvailability Method
    - [x] checks if (item.getQuantity >= item.getAvailableQuantity){
        - [x] if greater, System.out.println("System is unable to add [item name] to the card. System only has [item available quantity] [item name]s.)" and return false. Otherwise, return true."
## - [x] add() Method
        - [x] if item EXIST return false
        - [x] if it is already in the collection and is available
            - [x] increase the quantity by 1 and return true
        - [x] if item does not exist is not null
        - [x] add the item to the collection and return true 
        ```
        item.setQuantity(1);
        ```
        - [x] else return false
## - [] remove() Method
    - [x] checks if the item is in the collection
    - [] if it is, remove it
    - [] and return the item obj removed
    - [] if not in the collection
    - [] then return null

