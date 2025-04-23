# OrangeHRM Automation Using Page Object Model (POM)

## Overview

This project automates the OrangeHRM web application workflows using Selenium WebDriver and the Page Object Model (POM) design pattern. The automation covers:

- Logging into the OrangeHRM demo site
- Navigating to the PIM module
- Adding multiple employees
- Verifying the added employees in the Employee List
- (Logout functionality placeholder)

## Demo Site

[OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)

Use the following credentials (provided on the site):

- **Username:** Admin
- **Password:** admin123


## Technologies Used

- Java 17+
- Selenium WebDriver 4.18.1
- WebDriverManager 5.14.2
- TestNG 7.10.3
- Maven for dependency management
- ChromeDriver (automatically managed by WebDriverManager)


## Project Structure

src/
└── main/
└── java/
├── pages/
│ ├── LoginPage.java
│ ├── DashboardPage.java
│ ├── AddEmployeePage.java
│ └── EmployeeListPage.java
└── test/
└── java/
└── OrangeHRMTest.java

- **pages/**: Contains Page Object Model classes representing different pages of the OrangeHRM application.
- **OrangeHRMTest.java**: Test class that executes the automation workflow.


## Setup Instructions

1. **Clone the repository:**


2. **Ensure Java and Maven are installed:**

- Java 17 or higher
- Maven 3.6 or higher

3. **Build the project and download dependencies:**


4. **Run the test:**

## How the Automation Works

### 1. Login Flow

- Opens the OrangeHRM login page.
- Enters username and password.
- Clicks the login button to access the dashboard.

### 2. Navigate to PIM Module

- Uses mouse hover action to navigate to the PIM module.
- Clicks on the PIM menu.

### 3. Add Employees

- On the PIM page, adds 3 employees by entering their first, middle, and last names.
- Saves each employee's details.

### 4. Verify Employees in Employee List

- Navigates to the Employee List page.
- Scrolls through the list to locate the added employees.
- Prints "Name Verified" for each employee found.

### 5. Logout

 Placeholder for logout functionality (can be implemented as needed).


## Notes

- The project uses **WebDriverManager** to automatically manage ChromeDriver binaries.
- Implicit waits are configured for element loading.
- The test currently runs on Google Chrome; you can modify the setup to use other browsers.
- Employee verification is done by matching full names in the employee list table.


## Future Enhancements

- Implement logout functionality.
- Add explicit waits for better synchronization.
- Parameterize employee data using external files (CSV, Excel).
- Add reporting and screenshots on test failure.
- Integrate with CI/CD pipelines.



## Contributing

Feel free to fork the repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

Happy Testing! 🚀
