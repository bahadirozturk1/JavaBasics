# Java Basics

## Student Database Application

### Overview
This application allows user to manage student enrollments, track tuition payments and display student information.

### Features
* Student enrollment: Can enroll multiple students in multiple classes
* Tuition Management: Can calculate and displays tuition balance and processes payments
* Student Information Display: Can view detailed information about each student, including their enrolled courses and remaining tuition balance

### Output
Enter number of new students to enroll: 2

Enter students first name: John

Enter students last name: Doe

1-Freshman

2-Sophomore

3-Junior

4-Senior

Enter grade level: 2

Enter course to enroll (Q to quit): Math 101

Enter course to enroll (Q to quit): History 201

Enter course to enroll (Q to quit): Q

Your balance is: $1200

Enter your payment: $600

Thank you for your payment of: $600

Your balance is: $600



Name: John Doe

Grade level: 2

Student ID: 21001

Courses Enrolled:

Math 101

History 201

Balance: $600

---------------------------------------------------------------------

## Pizza Ordering System
### Overview
This application simulates a pizza ordering system where users can create a basic or deluxe pizza, customize it with additional toppings, extra cheese, and choose between take-away or dine-in options. The application calculates and displays the final bill based on the selected options.

### Features
Basic Pizza Ordering: Choose between a vegetarian or non-vegetarian pizza base.

Customizations:

Add extra cheese.

Add extra toppings.

Choose take-away.

Deluxe Pizza: A special pizza with both extra cheese and extra toppings automatically included.

Billing System: Generates and displays the final bill with all selected options and their costs.

### Output

Pizza: 300

Cheese added: 50

Toppings added: 100

Total price: 450

## Number Guessing Game
### Overview

The Number Guessing Game is a simple console-based game where the player attempts to guess a randomly generated number within a user-defined range. The game provides feedback on whether the guess is too high or too low, and counts the number of attempts taken to guess correctly.

### Features

User-Defined Range: The player can choose the upper limit of the number range.

Random Number Generation: The program generates a random number within the range specified by the player.

Interactive Feedback: The game informs the player if their guess is too high, too low, or correct.

Attempt Counter: The program tracks and displays the number of guesses made by the player.

### Output

enter a number to pick from: 100

Enter your guess 1-100

50

higher

Enter your guess 1-100

75

lower

Enter your guess 1-100

63

Correct! you've guessed in 3 tries

----------------------------------------------------------------------

## Login System Application
### Overview
This application provides a simple login system using Java Swing for the graphical user interface. It allows users to log in with predefined credentials and displays a welcome message upon successful login.

### Features
User Authentication: Users can log in using a predefined set of usernames and passwords.

Login Interface: Provides a GUI with fields for username and password, along with login and reset buttons.

Welcome Page: Displays a welcome message with the username after a successful login.

### Output
Upon running the application, the following sequence occurs:

Login Page: Users are prompted to enter their username and password. 

The interface includes:

A text field for the username.

A password field for the password.

Login and Reset buttons.

Message labels to show login status.

Successful Login: If the username and password match the predefined credentials:

A "Login Successful" message appears.

The login window closes and a new window opens displaying a welcome message with the username.

Unsuccessful Login: If the credentials do not match:

An error message appears indicating either "Wrong Password" or "Username not found".

---------------------------------------
## Email Management Application
### Overview
This application manages employee email accounts, including generating emails based on user input, setting mailbox capacity, and handling passwords. It allows users to create an email account with a specified department and generates a random password for the account.

### Features
Email Generation: Creates an email address based on the user's first and last name, department, and a company suffix.

Password Management: Generates a random password and provides methods to set and change passwords.

Mailbox Capacity: Allows setting and retrieving the mailbox capacity.

Alternate Email: Provides methods to set and retrieve an alternate email address.

### Example
Upon running the application, the following sequence occurs:

Email Creation:

The user is prompted to enter their first name, last name, and department.

A random password is generated and displayed.

An email address is created in the format: firstname.lastname@department.companySuffix.com.

Email Information Display:

Displays the user's full name, company email address, and mailbox capacity.

### Output
Enter the department

1 for Sales

2 for Development

3 for Accounting

0 for none

Enter department code: 1

Your password is: [randomly generated password]

DISPLAY NAME: John Smith

COMPANY EMAIL: john.smith@sales.aeycompany.com

MAILBOX CAPACITY: 500mb

------------------------------------------