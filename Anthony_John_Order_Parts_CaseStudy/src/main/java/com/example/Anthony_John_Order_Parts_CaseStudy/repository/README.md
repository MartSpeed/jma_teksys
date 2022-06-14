##### 20220614
# REPOSITORY PACKAGE
The *Repository package* holds the **Java Interface** file for each **Entity/Data Access Object(DAO)**.
<br>
 The repository is responsible for the **CRUD operations** of your *entity fields* from the DAO.
<br>
The repository will *extend* the **JpaRepository** specifically for the use of the **Iterable functionality**.
<br>
> *NOTE*: 

---

# AIRCRAFT REPOSITORY
the aircraft repository is responsible for handling how the aircraft methods that supply the information for each objects method
- aircraftStatus
    check to see the current status of the aircraft
    - private String redX
    - private String redSlash
    - private String redDash
    - private String signature
- isAircraftBroken
    this will check is the current aircraft selected has any listed parts broken
- inspectionRequired
    if condition is a redDash
- flightReady
    if condition is a signature
- 

# LANDING GEAR REPOSITORY

# WING REPOSITORY

# RUDDER REPOSITORY

# ELEVATOR REPOSITORY