The program is a simple Spring REST API application for managing a list of employees.  
  
Features:
1. Display the Employee List: Allows retrieving a list of all employees from the database.
2. View a Specific Employee: Provides details of a specific employee using their ID.
3. Add a New Employee: Supports adding a new employee to the database.
4. Update Employee Information: Enables updating the details of an existing employee.
5. Delete an Employee: Allows removing an employee from the database.
6. Database: Employee data is stored in a MySQL database, using Hibernate for ORM.  
  
API Endpoints:
* GET /api/employees  
Retrieves a list of all employees.

* GET /api/employees/{id}  
Retrieves details of a specific employee based on their ID.

* POST /api/employees  
Adds a new employee. The request body should contain employee details in JSON format.

* PUT /api/employees  
Updates an existing employee. The request body should contain updated employee details in JSON format.

* DELETE /api/employees/{id}  
Deletes an employee based on their ID.  
***
For create table:  
```sql
CREATE TABLE employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15) NOT NULL,
  surname varchar(25) NOT NULL,
  department varchar(20) NOT NULL,
  salary int NOT NULL,
  PRIMARY KEY (id)
) ;
```
