# Design Process Requirements

I will be documenting the key design process development work implememted to plan this Shopping cart system

## Use case diagram and use cases

### UML Use Case Diagram

"A use case diagram is a model of requirements of a system at a high level" (Unhelkar, B. (2017).
This use case diagram demonstrates the requirements that are carried out in the shopping cart system alongside the stakeholders communicating with the system.
The diagram shows 3 main actors in the system: Customer, Anonymous (a generalisation assosiation (Bennett et al. , 2004 p.28) from a customer, once the anonnymous user creates an account) and Admin. It also has Bank which interacts with the transactions made to transfer money between the two accounts.

[fullusecaseupdated](https://user-images.githubusercontent.com/72127228/148687628-0430a080-0f6a-4e76-a12f-dcb47e49904a.png)

Below is the use case description for the Shopping cart system.

| Use case Number 	| Actor Type  	 | Description | System |
| --------------- 	| -------------- | ----------- | ------ |
| U01 	| Customer/Anonymous/Admin | The user will enter the site | The system will show the home page which is the page with the catalouge|
| U02 	| Customer/Anonymous/Admin | The user will search for an item | The system will display a page which meets the searching critera |
| U03 	| Customer/Anonymous | The user will add an item to the shopping cart | The system add the item to the shopping cart and increases the quantiy of the item by 1 |
| U04 	| Customer/Anonymous | The user will remove an item from the shopping cart | The system removes the item to the shopping cart and decreases the quantiy of the item by 1  |
| U05 	| Customer/Admin | The user will sign into the system | The system will create a session for the user and store it |
| U06 	| Anonymous | The user will create a new account | The system will allow the user to enter in their details and adds the new user to the database |
| U07 	| Customer/Admin | The user will modify their account details | The system will update the users information on the database |
| U08 	| Customer | The user will enter correct card deatails and purchase their content in the shopping cart | The system will transfer money between accounts (customer and the shop) via the Bank REST API and create an invoice of the orders |
| U09 	| Customer | The user will enter incorrect card deatails| The system will dispaly an error message and the error will be logged |
| U10	| Customer | The user will view their orders placed | The system will dispaly a page for viewing their orders |
| U11 	| Admin | The user will add an item to the catalogue| The system will add the new item to the database |
| U12 	| Admin | The user will modify item in catalogue | The system will update the item in the database |
| U13 	| Admin | The user will delete item in catalogue | The system removes the item from the catalouge and is no longer availible to the users |
| U14	| Admin | The user will view catalogue inventory | The system will display all items in the catalouge and quantity which is availible  |
| U15 	| Admin | The user will view and modify all orders placed | The system displays a page with all orders on the system and shows an option to update the status of the order |
| U16 	| Admin | The user will view and modify account role for users | The system displays a page withh all users on the system and an option to chnage thier rol |
| U17	| Customer/Admin | The user will log out | The system changes the session into anonymous |
| U18 	| Customer/Anonymous/Admin | The user will deactivate account|  The system will remove users scess to login but keep order infomation for the admin to view |
| U19 	| Customer/Anonymous/Admin | The deactivated user will try to log in | The system will not allow the user to log in |

## Test Plan

In this shopping cart system I will provide a comprehensive range of tests through unit testing for each module in my design. A Unit test is "the process of testing a part of an application in isolation from the rest of the application" (Unhelkar, B. (2017). By completing unit tests, it will provide us insightful infomation with what layer needs to be worked on and if it will stand alone and work sucessfully. In addition it will make sure that the User Interface is functional by reacting with the system. Below is the test plan for the ui and intergration tesing process.

| Test Case Number	| Test Description	| Action | Expected Result | Actual Result | Pass/Fail |
| --------------- 	| ------------------| ------ | --------------- | ------------- | --------- |
| T01 	| U01 | User will load site  | Catalogue page shown on screen  |  - |  - | 
| T02 	| U02 | User will enter in the item they want to search for in search bar | Items which share same name shown on screen  | -  | - | 
| T03 	| U03 | User will click add item to cart | Message confirming that have added item to the shopping cart is displayed  | -  | - |
| T03.1 	| U03 | User will click add item to cart, that is not in inventory| Error message displayed - item out of stock  | -  | - |
| T04 	| U04 | user will remove an item from the shopping cart | Message confirming that they have sucessfully removed the item from the shopping cart is displayed | -  | - |
| T05 	| U05 | user will click sign into the system | Sign in page displays and contains required inputs  | -  | - |
| T06 	| U06 | user will click create a new account | New account page displays and contains required inputs   |  -  | - |
| T07 	| U07 | user will click modify their account details | user account page will show up and user has the option to alter their details expect formt he modify role button  |  -  | - |
| T08 	| U08 | user will click the shopping cart | Shopping cart page will load  |  -  | - |
| T08.1	| U08 | user will click the shopping cart, checkout | Enter card details will load  |  -  | - |
| T08 	| U08 | user will click the shopping cart | Shopping cart page will load  |  -  | - |
| T09 	| U09 | user will enter incorrect card deatails| Error message is displayed - incorrect card details  |  -  | - |
| T10	  | U10 | user will click to view their orders placed | All recent orders will display | -  | - |
| T11 	| U11 | user will add an item to the catalogue | Item will show on the catalogue page  | -  | - |
| T12 	| U12 | user will modify item in catalogue| Item will update on the catalogue page if still in stock | -  | - |
| T13 	| U13 | user will delete item in catalogue| Item is not availbe for users to purchase on the catalogue page  |  -  | - |
| T14	  | U14 | user will change catalogue inventory | Items stock are updated for the items specified |  -  | - |
| T15 	| U15 | user will click view and modify all orders placed | The order status is updated for the user   |  -  | - |
| T16 	| U16 | user will click view and modify account role for users| The users details are updated on the users "modify details" page  |   -  | - |
| T17	  | U17 | user will click log out	| Session for the current user is removed  | -  | - |
| T18 	| U18 | user will click  deactivate account | Confirmation message appears - are you sure you would like to do this action? Then user is unable to access account and session is removed for user |  -  | - |
| T19 	| U19 | deactivated user will try to log in | Error message displayed  -  "Sorry your account has been deactivated" |  -  | - |

# References
BENNETT, S.J., J. SKELTON and K. LUNN, 2004. Schaum’s Outline’s UML. 2nd ed. New York, NY: McGraw-Hill Professional.  
UNHELKAR, B., 2017. Software Engineering with UML. London, England: Auerbach




