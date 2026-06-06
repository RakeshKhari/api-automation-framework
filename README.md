# API Automation Framework

A scalable API Automation Framework built using Java, Rest Assured, TestNG, Maven, Allure Reports, GitHub Actions CI/CD, and Data-Driven Testing.

---

## Tech Stack

* Java 17
* Rest Assured
* TestNG
* Maven
* Allure Reporting
* GitHub Actions
* Jackson Databind
* OpenCSV
* Apache POI
* JSON Library
* Hamcrest

---

## Project Structure

```text
api-automation-framework
│
├── .github
│   └── workflows
│       └── api-tests.yml
│
├── src
│   └── test
│       ├── java
│       │   ├── base
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── tests
│       │   │   ├── TC01_Get_All_Posts.java
│       │   │   ├── TC02_Get_Single_Post.java
│       │   │   ├── TC03_Validate_Response_Time.java
│       │   │   ├── TC04_Create_Post.java
│       │   │   ├── TC05_Validate_Header.java
│       │   │   ├── TC06_Update_Post.java
│       │   │   ├── TC07_Patch_Post.java
│       │   │   ├── TC08_Delete_Post.java
│       │   │   ├── TC09_Validate_JSON_Body.java
│       │   │   ├── TC10_Invalid_Endpoint.java
│       │   │   ├── TC11_Validate_Response_Body.java
│       │   │   ├── TC12_Validate_Header.java
│       │   │   ├── DataDrivenCSVTest.java
│       │   │   └── DataDrivenJsonTest.java
│       │   │
│       │   └── utils
│       │       ├── CsvDataProvider.java
│       │       └── JsonUtils.java
│       │
│       └── resources
│           └── testdata
│               ├── user.csv
│               ├── user.json
│               └── user.xlsx
│
├── pom.xml
├── testng.xml
└── README.md
```

---

## Framework Features

* API CRUD Operations Testing
* Request and Response Validation
* Status Code Validation
* Header Validation
* Response Time Validation
* JSON Schema Validation
* Data-Driven Testing using CSV
* Data-Driven Testing using JSON
* Data-Driven Testing using Excel
* TestNG Test Execution
* Allure Reporting
* GitHub Actions CI/CD Integration

---

## 📋 Test Scenarios Covered

| Test Case | Description                 |
| --------- | --------------------------- |
| TC01      | Get All Posts               |
| TC02      | Get Single Post             |
| TC03      | Validate Response Time      |
| TC04      | Create Post                 |
| TC05      | Validate Response Header    |
| TC06      | Update Post                 |
| TC07      | Patch Post                  |
| TC08      | Delete Post                 |
| TC09      | Validate JSON Body          |
| TC10      | Invalid Endpoint Validation |
| TC11      | Validate Response Body      |
| TC12      | Header Validation           |
| DD01      | CSV Data Driven Testing     |
| DD02      | JSON Data Driven Testing    |

---

## Prerequisites

* Java 17+
* Maven 3.9+
* Git
* IntelliJ IDEA / Eclipse
* Allure CLI

---

## Installation

Clone the repository:

```bash
git clone https://github.com/your-username/api-automation-framework.git
```

Navigate to project:

```bash
cd api-automation-framework
```

Install dependencies:

```bash
mvn clean install
```

---

## ▶️ Run Tests

Run all tests:

```bash
mvn clean test
```

Run a specific suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Allure Reporting

Generate report:

```bash
allure generate target/allure-results --clean -o target/allure-report
```

Open report:

```bash
allure open target/allure-report
```

Or:

```bash
allure serve target/allure-results
```

---

## 🔄 GitHub Actions CI/CD

Workflow automatically runs on:

* Push
* Pull Request

Pipeline Steps:

1. Checkout Code
2. Setup Java 17
3. Install Dependencies
4. Execute Tests
5. Generate Allure Results
6. Upload Artifacts

---

## Test Data Management

CSV Example:

```csv
title,body
Java,Automation
Selenium,Testing
API,RestAssured
```

JSON Example:

```json
[
  {
    "title":"Java",
    "body":"Automation"
  },
  {
    "title":"API",
    "body":"Testing"
  }
]
```


---

##  Future Enhancements

* Excel Data Provider
* Extent Reports
* Jenkins Integration
* Docker Integration
* Parallel Execution
* Environment Configuration
* Request/Response Logging
* API Schema Validation
* Retry Mechanism
* Slack Notifications

---

##  Author

Rakesh Khari

QA Automation Engineer | SDET

Skills:

* API Automation
* Selenium
* Rest Assured
* Java
* TestNG
* Maven
* GitHub Actions
* CI/CD

---

## ⭐ Support

If you found this project useful, please give it a star on GitHub.
