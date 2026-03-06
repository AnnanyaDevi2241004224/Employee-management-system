# Employee Management System

A Spring Boot based REST API project to manage employee records in an organization.
The system supports full CRUD operations along with validation, exception handling, pagination, sorting, AOP logging, and a simple frontend UI using Thymeleaf.

---

## Features

* Create Employee
* View All Employees
* View Employee By ID
* Update Employee
* Delete Employee
* Input Validation
* Global Exception Handling
* Pagination
* Sorting
* Spring AOP Logging
* MySQL Database Integration
* Simple UI using HTML / Thymeleaf

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Spring Validation
* Spring AOP
* Thymeleaf
* Maven
* Git & GitHub

---

## Employee Entity

Each employee contains the following fields:

| Field       | Type   | Description        |
| ----------- | ------ | ------------------ |
| id          | Long   | Unique employee ID |
| name        | String | Employee full name |
| email       | String | Official email     |
| department  | String | Department name    |
| salary      | Double | Employee salary    |
| designation | String | Job role           |

Example JSON:

```json
{
  "name": "Rahul Verma",
  "email": "rahul.verma@company.com",
  "department": "Finance",
  "salary": 65000,
  "designation": "Accountant"
}
```

---

## API Endpoints

### Create Employee

POST `/employees`

### Get All Employees (Pagination + Sorting)

GET `/employees?page=0&size=5&sort=salary,desc`

### Get Employee by ID

GET `/employees/{id}`

### Update Employee

PUT `/employees/{id}`

### Delete Employee

DELETE `/employees/{id}`

---

## Project Structure

```
employee-management
│
├── controller
├── service
├── repository
├── model
├── exception
├── aspect
│
├── templates
├── static
│
└── EmployeeManagementApplication
```

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/AnnanyaDevi2241004224/Employee-management-system.git
```

2. Configure MySQL database in `application.properties`

3. Run the Spring Boot application

4. Open the application in browser

```
http://localhost:8080
```

---

## Screenshots

Postman API Testing and Application Screenshots are available in the **myFiles** folder.

---

## Author

Annanya Devi
