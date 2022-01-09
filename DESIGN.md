# Design Process Requirements

I will be documenting the key design process development work implememted to plan this Shopping cart system

## Use case diagram and use cases

### UML Use Case Diagram

"A use case diagram is a model of requirements of a system at a high level" (Unhelkar, B. (2017).
This use case diagram demonstrates the requirements that are carried out in the shopping cart system alongside the stakeholders communicating with the system.
The diagram shows 3 main actors in the system: Customer, Anonymous (a generalisation assosiation (Bennett et al. , 2004 p.28) from a customer, once the anonnymous user creates an account) and Admin.

![fullusecase](https://user-images.githubusercontent.com/72127228/148649774-0fbb9961-e809-492d-aaf2-589e7a709145.png)

Below is the use case description for the Shopping cart system.

| Use case Number 	| Actor Type  	 | Description | System |
| --------------- 	| -------------- | ----------- | ------ |
| 01 	| Customer/Anonymous/Admin | The user will enter the site | The system will show the home page which is the page with the catalouge|
| 02 	| Customer/Anonymous/Admin | The user will search for an item | The system will display a page which meets the searching critera |
| 03 	| Customer/Anonymous | The user will add an item to the shopping cart | The system add the item to the shopping cart and increases the quantiy of the item by 1 |
| 04 	| Customer/Anonymous | The user will remove an item from the shopping cart | The system removes the item to the shopping cart and decreases the quantiy of the item by 1  |
| 05 	| Customer/Admin | The user will sign into the system | The system will create a session for the user and store it |
| 06 	| Anonymous | The user will create a new account | The system will allow the user to enter in their details and adds the new user to the database |
| 07 	| Customer/Admin | The user will modify their account details | The system will update the users information on the database |
| 08 	| Customer | The user will enter correct card deatails and purchase their content in the shopping cart | The system will transfer money between accounts (customer and the shop) via the Bank REST API and create an invoice of the orders |
| 09 	| Customer | The user will enter incorrect card deatails| The system will dispaly an error message and the error will be logged |
| 10	| Customer | The user will view their orders placed | The system will dispaly a page for viewing their orders |
| 11 	| Admin | The user will add an item to the catalogue| The system will add the new item to the database |
| 12 	| Admin | The user will modify item in catalogue | The system will update the item in the database |
| 13 	| Admin | The user will delete item in catalogue | The system removes the item from the catalouge and is no longer availible to the users |
| 14	| Admin | The user will view catalogue inventory | The system will display all items in the catalouge and quantity which is availible  |
| 15 	| Admin | The user will view and modify all orders placed | The system displays a page with all orders on the system and shows an option to update the status of the order |
| 16 	| Admin | The user will view and modify account role for users | The system displays a page withh all users on the system and an option to chnage thier rol |
| 17	| Customer/Admin | The user will log out | The system changes the session into anonymous |
| 18 	| Customer/Anonymous/Admin | The user will deactivate account|  The system will remove users scess to login but keep order infomation for the admin to view |
| 19 	| Customer/Anonymous/Admin | The deactivated user will try to log in | The system will not allow the user to log in |

## Test Plan

In this shopping cart system I will provide a comprehensive range of tests. Unit Tests will be used to 

# References
BENNETT, S.J., J. SKELTON and K. LUNN, 2004. Schaum’s Outline’s UML. 2nd ed. New York, NY: McGraw-Hill Professional.  
UNHELKAR, B., 2017. Software Engineering with UML. London, England: Auerbach




