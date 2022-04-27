# Project 1

Create a new package in your exercise project named com.perscholas.cafe. Create a class named Product inside this package with four private attributes (name, price, description, quantity). The class should also include a no-arg constructor and a constructor which takes three arguments for name, price and description. Next, create getters and setters and include a method named calculateProductTotal( ) which calculates the product subtotal for the order. Create a driver class (i.e., class that includes a main method) named CafeApp which creates three Product instances named "coffee", "espresso" and "cappuccino". Assign descriptions and prices to each product instance. Use the Scanner class to prompt the user for the quantity of each product and then print the name, description and product subtotal for each after each prompt. Print the sales subtotal, sales tax and sales total before exiting the application.

[x] create a new package name com.perscholas.cafe
[x] create a class named Product inside this package
[x] create 4 private variables
    [x] -- name
    [x] -- price
    [x] -- description
[x] create getters and setters
    [x] -- name get/return, set/this.set
    [x] -- price get/price, set/this.set
    [x] -- description get/description, set/this.set
[x] create method calculateProductTotal()
    -- [x] calculates the product subtotal for the order.
[x] create a driver class called CafeApp
[x] create Product instances
    [x] -- coffee
    [x] -- espresso
    [x] -- cappuccino
        [x] -- assign product descriptions
        [x] -- assign product prices
[x] Use the Scanner class to prompt the user for the quantity of each product
    [x] -- print the name of products
    [x] -- print the description of products
    [x] -- print subtotal of products
        [x] -- print the sales subtotal
        [x] -- print the sales tax
        [x] -- sales total

# Project 2

Inheritance & Abstract Classes

Make the Product class in the previous cafe exercise an abstract class and make the method calculateProductSubtotal in the Product class an abstract method. Now create three new classes (Coffee, Espresso, Cappuccino) which each extend the Product class. You will get an error in the new classes once you extend them due to the missing implementation of the calculateProductSubtotal( ) method. If you hover over the class name with this error you will be given the option to add the method. Go ahead and click the link to add the method (alternatively, you can simply write the method yourself). You should end up with an empty method with the @Override annotation. Do this for each class.

In the Coffee class, add the boolean attributes, sugar and milk. Create a no-arg constructor which calls the super constructor and assigns this.milk and this.sugar to false. Create a constructor which accepts five attributes (three from Product and two from Coffee) and passes three arguments to the super constructor and assign this.milk and this.sugar to the arguments passed to the constructor. Create getters and setters for the two added attributes. Implement the calculateProductSubtotal method.
In the Espresso class, add the boolean attributes extraShot and macchiato and complete the process as with the Coffee class. In the calculateProductSubtotal method, add $2.00 to each item with an extra shot and add $1.00 to each item made in macchiato style.
In the Cappuccino class, add the boolean attributes peppermint and whippedCream and complete the rest of the class as with the Coffee and Espresso classes. In the calculateProductSubtotal method, add $2.00 to each item with peppermint and add $1.00 to each item with whipped cream.
Rewrite the CafeApp class to utilize the Scanner class to accept orders for each product and, as before, print the name, description, quantity, and product subtotal for each item along with the sales subtotal, sales tax, and sales total.

[x] make the Product class and abstract class
[x] create calculateProductSubtotal() method
    [x] -- make calculateProductSubtotal() method and abstract class
[x] create 3 classes that extends from Product
    [x] -- create coffee class
        [x] -- extends Product class
    [x] -- create espresso class
        [x] -- extends Product class
    [x] -- create cappuccino class
        [x] -- extends Product class
[x] add override method to new classes
    [x] -- override coffee class
        [x] -- w/calculateProductSubtotal( ) method
    [x] -- override espresso class
        [x] -- w/calculateProductSubtotal( ) method
    [x] -- override cappuccino class
        [x] -- w/calculateProductSubtotal( ) method
# [x] Coffee Class
    [x] -- booleans attributes
        [x] -- sugar
        [x] -- milk
    [x] -- create no argument constructor
        [x] -- call super() constructor
        [x] -- assign this.sugar to false
        [x] -- assign this.milk to false
    [x] Constructor that take 5 attributes
        [x] Product attributes
            [x] Product Super Constructor (name, price, description)
                [x] -- name
                [x] -- price
                [x] -- description
        [x] Coffee attributes
            [x] Coffee Super Constructor (name, price, description)
            [x] -- sugar
            [x] -- milk
            [x] -- assign this.sugar to false
            [x] -- assign this.milk to false
        [x] Getters/Setters
            [x] -- getsugar.return
            [x] -- setsugar.this
            [x] -- getmilk.return
            [x] -- setmilk.this
        [x] implement calculateProductSubtotal method()
# [x] Espresso Class
    [x] -- boolean attributes
        [x] -- extraShot
        [x] -- macchiato
    [x] -- create no argument constructor
        [x] -- call super() constructor
        [x] -- assign this.extraShot to false
        [x] -- assign this.machiatto to false
    [x] Constructor that take 5 attributes
        [x] Product attributes
            [x] Product Super Constructor (name, price, description)
            [x] -- name
            [x] -- price
            [x] -- description
        [x] Coffee attributes
            [x] Coffee Super Constructor (name, price, description)
            [x] -- extraShot
            [x] -- macchiato
            [x] -- assign this.extraShot to false
            [x] -- assign this.macchiato to false
        [x] Getters/Setters
            [x] -- getextrashot.return
            [x] -- setextrashot.this
            [x] -- getmachiatto.return
            [x] -- setmachiatto.this
        [x] implement calculateProductSubtotal method()
# [x] Cappuccino Class
    [x] -- boolean attributes
        [x] -- peppermint
        [x] -- whippedCream
    [x] -- create no argument constructor
        [x] -- call super() constructor
        [x] -- assign this.peppermint to false
        [x] -- assign this.whippedCream to false
    [x] Constructor that take 5 attributes
        [x] Product attributes
            [x] Product Super Constructor (name, price, description)
                [x] -- name
                [x] -- price
                [x] -- description
        [x] Coffee attributes
            [x] Coffee Super Constructor (name, price, description)
            [x] -- peppermint
            [x] -- whippedCream
            [x] -- assign this.peppermint to false
            [x] -- assign this.whippedCream to false
        [x] Getters/Setters
            [x] -- getpeppermint.return
            [x] -- setpeppermint.this
            [x] -- getwhippedCream.return
            [x] -- setwhippedCream.this
        [x] implement calculateProductSubtotal method()

# Project 3

We will continue the Cafe concept for this exercise.

Create two new abstract methods in the Product class: addOptions() and printOptions(); Implement these methods in each of the subclasses.
Write a program that prompts the user to select products from the cafe and select options attached to those products (e.g, "Would you like sugar with the coffee?"), but this time include store and shopping cart classes and include classes for each item (you may use the classes created in previous exercises and add these products to lists in the store and shopping cart classes). Options may or may not incur additional cost, but you should have at least one product that has options which do incur additional cost. Have the user select items from the store and specify any options. Add the items to the shopping cart. Print out a list of each item with price, quantity and item subtotal along with the purchase subtotal, sales tax and purchase total after the user is done selecting items (i.e., there should be a choice on the menu to “check out” at which time the purchase totals are displayed and the application quits.
Optional: Create and implement a custom exception