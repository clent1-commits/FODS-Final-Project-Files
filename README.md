Log In Management System with CRUD Operations
Clent Anthony Barba BSIT 2A-AI

Purpose:
This system allows users to securely log in, manage user records, and perform CRUD (Create, Read, Update, Delete) operations on a
MySQL database hosted on phpMyAdmin. It provides an intuitive GUI
for efficient interaction. 

Functionality:
-User Registration: Allows new users to sign up.  Login System: Authenticates users and redirects them to the
CRUD system. 

CRUD Operations:
- Add a user.  View all users.  Update user details.  Delete users. Features:
-Secure login system.  User-friendly GUI.  Real-time validation for input fields.
-Connection to a MySQL database for data storage and retrieval.

Workflow
Login Process:
- Users launch the application and are greeted with a login screen.
- The user provides their credentials (username and password).
- Upon successful authentication, the system transitions to the
main interface for managing records.
- If the login fails, an error message is displayed, prompting the
user to retry. Sign-Up Process:
- Users can create a new account using the sign-up feature.
-The system validates the input fields to ensure data integrity.
- A new record is inserted into the database upon successful
registration.

Main Interface (CRUD Operations):
After logging in, the user accesses the main CRUD interface. 

Features available:
- Create: Add a new user to the database by filling out the form and
clicking the "Add" button.
- Read: View all user records in the system using the "Display All" button, which populates a table with database data.
- Update: Select a record from the table, modify the fields, and click
"Update" to save changes.
- Delete: Select a record from the table and click "Delete" to
remove it from the database.

 Database Connection:
The system connects to a MySQL database hosted on
phpMyAdmin using JDBC.
It ensures secure communication with proper error handling. 

Error Handling:
The system displays user-friendly error messages for invalid inputs, empty fields, or database connection issues.

Setup Instructions
Prerequisites
- Install Java JDK 8 or above.
- Install NetBeans IDE with Java Swing support.
- Set up a MySQL server and phpMyAdmin.

Database Configuration:
Database Configuration in phpMyAdmin
- Open phpMyAdmin in your browser.
- Create a database named sql12749143 or used my database, just log in using the credentials I provided.

Import the provided sql12749143.sql file:(If you create a database)
- Go to the Import tab in phpMyAdmin.
- Choose the sql12749143.sql file.
- Click Go. Application Configuration
- Open the project in NetBeans.
- Update the DBConnection class with your phpMyAdmin database

credentials:
Update the DBConnection class with your or mine database credentials:
public class DBConnection {
public static Connection connect() throws SQLException {
String url = "jdbc:mysql://localhost:3306/sql12749143"; // Update
with your database name
String user = "your_username"; // Replace the database
username
String password = "your_password"; // Replacethe database
password
return DriverManager.getConnection(url, user, password);
}
}
Run the Application
1. Download the LoginApp.java. Go to NetBeans app, go to File - Open project and choose loginApp. Run the LoginApp.java file
in NetBeans.
2. Test the system:
- Sign-Up: Register a new user.
- Login: Use the registered credentials to log in.
- CRUD: Add, update, view, and delete users.

Database Schema
Table Users :
Field Name Data Type Constraints
Id INT Primary key,Auto
Increment
Name VARCHAR (50) NOT NULL, UNIQUE
Password VARCHAR(255) NOT NULL
Email VARCHAR (100) NOT NULL, UNIQUE

Database Information
- Database Name: sql12749143
- Username: sql12749143
- Password: 3MtUcBcFDG
- Host: sql12.freesqldatabase.com

https://www.phpmyadmin.co/index.php

Backup File
- File Name: sql12749143.sql
- Location: Included in the project folder or Github link I provided.

Import Instructions
- Open phpMyAdmin.
-  Create a database namedsql12749143.
  
Import the sql12749143.sql file:
- Go to the Import tab.
- Select the file and click Go.

- GitHub Link (You can download the LoginApp file and sql12749143.sql
here if there is a problem on the files I provided):
https://github.com/clent1-commits/FODS-Final-Project-Files
