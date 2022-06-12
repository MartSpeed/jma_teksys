##### 20220611
# ENTITY PACKAGE
The entity package contains all of our Database Access Objects (DAO). These objects will contain all the information we want to
access in them using Lombok annotations.

# AIRCRAFT ENTITY
- [X] Landing Gear - int id
    - [x] Nose 
    - [x] Left Main 
    - [x] Right Main 
- [x] Wing - int id
    - [x] Left 
    - [x] Right
- [x] Elevator - int id
    - [x] Left
    - [x] Right
- [x] Rudder - int id

# LANDING ENTITY
the landing gear DAO will contain the correct landing gear type to order and how many are available of that type. you can put in an order for more, but you can not cancel you order.
- [x] Nose Landing Gear
- [x] Right Main Landing Gear
- [x] Left Main Landing Gear

## EXTRA???
- the landing gear type will determine which code you need to use to order for the aircraft.
- how do I make

# WING ENTITY
the wing DAO will contain the contain the correct wing type to order and how many are available of that type. you can create an order and you can only cancel your current order.
- [x] Right Wing
- [x] Left Wing

# RUDDER ENTITY
the rudder DAO will contain the correct rudder type to order and how many are available of that type. you can create an order and you can cancel any order.
- [x] rudder

# ELEVATOR ENTITY
the elevator DAO will contain the correct elevator type to order and how many are available of that typ.e you can create only a single order at a time, you can only cancel order older than you current order.
- [x] right elevator
- [x] left elevator
---
# EXTRAS - will move once the rep is completed after testing

# AIRCRAFT INTERFACE - wireframe
- [] it will contain a list of all current working aircraft
    - ???(might be interface call)
- [] it will contain a list of all current inoperable aircraft
    - ???(might be interface call)
- [] it will contain a list of current aircraft that require specific parts to be completed
    - ???(might be interface call)
- [] the aircraft Interface will contain the list of all current aircraft
    - ???(might be interface method)
- [] the aircraft Interface will contain the list of all current aircraft parts