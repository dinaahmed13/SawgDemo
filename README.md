# SawgDemo – Web Automation Testing Project

[![Testing](https://img.shields.io/badge/Testing-Selenium%20%7C%20TestNG-blue)](https://www.selenium.dev/)
[![Automation](https://img.shields.io/badge/Automation-Web%20Automation-orange)](https://www.selenium.dev/)
[![Framework](https://img.shields.io/badge/Framework-Page%20Object%20Model-green)](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)
[![Build Tool](https://img.shields.io/badge/Build-Maven-red)](https://maven.apache.org/)
[![Language](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Status](https://img.shields.io/badge/Project-Completed-success)]()

## 📌 Project Overview

This project is an End-to-End Web Automation Testing project for the SauceDemo web application.

The project automates the main user journey from Login and product selection to Add to Cart, Cart validation, and Checkout, along with positive and negative test scenarios.

The automation framework is built using Selenium WebDriver, Java, TestNG, Maven, and the Page Object Model (POM).

---

## 🎯 Testing Objectives

- Automate the main end-to-end user flow.
- Validate Login functionality.
- Validate product selection and Add to Cart functionality.
- Verify Cart and Checkout workflows.
- Cover positive and negative test scenarios.
- Validate Checkout with valid and invalid data.
- Verify Continue Shopping functionality.
- Apply Page Object Model (POM) for reusable and maintainable automation code.
- Support data-driven testing using TestNG DataProvider.
- Execute the TestNG test suite through Maven Surefire Plugin.

---

## 🔄 End-to-End User Flow

The main End-to-End scenario covers the complete user journey:

```text
Login
   ↓
Product Selection
   ↓
Add to Cart
   ↓
Cart Validation
   ↓
Checkout
   ↓
Successful Order Completion
```

---

## 🧪 Automated Test Scenarios

### Positive Scenarios

- Valid Login
- Multiple Valid Add to Cart
- Cart Validation
- Checkout with Valid Data
- Continue Shopping

### Negative Scenarios

- Login Validation
- Invalid Checkout with Some Data
- Invalid Checkout with No Data
- Invalid Cart Checkout
- Invalid Continue Shopping

---

## 🏗️ Automation Framework

The project follows the **Page Object Model (POM)** design pattern to separate page elements and actions from test logic.

### Page Classes

Dedicated Page Classes are used for the main application pages:

- Login Page
- Product Page
- Cart Page
- Checkout Page

### BasePage

Contains reusable page-level actions and common methods used across the Page Classes.

### BaseTest

Provides common test setup and WebDriver initialization for the test classes.

### Test Classes

Contain the automated test scenarios and validations.

### TestNG DataProvider

Used to support data-driven testing with multiple test inputs.

### Maven Surefire Plugin

Configured to execute the TestNG test suite through `testing.xml`.

---

## 🛠️ Tools & Technologies

| Tool / Technology | Purpose |
|---|---|
| Java 17 | Programming Language |
| Selenium WebDriver | Web UI Automation |
| TestNG | Test Framework |
| Maven | Build & Dependency Management |
| Page Object Model (POM) | Automation Design Pattern |
| TestNG DataProvider | Data-Driven Testing |
| Maven Surefire Plugin | Test Suite Execution |

---

## 📂 Project Structure

```text
SawgLabs/
│
├── pom.xml
├── testing.xml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org.example/
│   │           ├── pages/
│   │           │   ├── cart/
│   │           │   │   └── CartPage.java
│   │           │   │
│   │           │   ├── Checkout/
│   │           │   │   └── CheckoutPage.java
│   │           │   │
│   │           │   ├── login/
│   │           │   │   └── LoginPage.java
│   │           │   │
│   │           │   └── product/
│   │           │       └── ProductPage.java
│   │           │
│   │           ├── BasePage.java
│   │           └── Main.java
│   │
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   │
│       │   └── tests/
│       │       ├── AddToCard.java
│       │       ├── DataProviderTest.java
│       │       ├── InValidScripts.java
│       │       └── LoginTest.java
│       │
│       └── resources/
│
└── target/
```

---

## ⚙️ Maven Configuration

The project uses Maven for dependency management and build configuration.

The project is configured with:

- Java 17
- TestNG 7.12.0
- Maven Surefire Plugin
- Maven Compiler Plugin

The TestNG suite is configured through:

```text
testing.xml
```

Maven Surefire is used to execute the configured TestNG test suite.

---

## ▶️ Test Execution

### Run Tests Using Maven

```bash
mvn test
```

The Maven Surefire Plugin executes the TestNG suite configured in `testing.xml`.

### Run Tests Using TestNG

The test suite can also be executed directly using the configured `testing.xml` file from the IDE.

---

## 📊 Test Coverage

The automation suite covers the following areas:

- Login
- Login Validation
- Product Selection
- Add to Cart
- Multiple Add to Cart
- Cart Validation
- Checkout
- Checkout with Valid Data
- Checkout with Invalid Data
- Continue Shopping
- Positive Testing
- Negative Testing
- End-to-End Testing
- Data-Driven Testing

---

## 💡 Automation Practices

The project applies the following automation practices:

- End-to-End Testing
- Positive Testing
- Negative Testing
- Page Object Model (POM)
- Reusable Page Classes
- BasePage
- BaseTest
- Data-Driven Testing
- TestNG
- Maven Build Management
- Maven Surefire Test Execution
- Selenium WebDriver

---

## 📁 Framework Components

### BasePage

Provides reusable methods and common page actions to reduce code duplication.

### BaseTest

Handles common test initialization and WebDriver setup.

### Page Objects

Each major application page has its own Page Class to keep locators and page actions organized.

### Test Classes

Contain the actual test scenarios and assertions.

### DataProvider

Allows the same test logic to be executed with different test data.

### testing.xml

Defines the TestNG test suite used for test execution.

---

## 🔍 Key Features

- Complete End-to-End user flow automation.
- Positive and negative scenario coverage.
- Reusable POM-based framework.
- Separate Page Classes for application pages.
- Reusable BasePage and BaseTest components.
- Data-driven testing with TestNG DataProvider.
- Maven-based dependency and build management.
- TestNG suite execution using Maven Surefire.

---

## 👩‍💻 Author

**Dina Ahmed**

Software Testing Engineer | Manual Testing | API Testing | Database Testing | Automation
