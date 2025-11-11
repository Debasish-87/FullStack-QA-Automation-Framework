# QA Automation Framework (Selenium + TestNG + Allure + API + DB + CI/CD + GitHub Pages)

This is a **Production-Grade** Automation Framework designed for **UI + API Testing** with a clean, modular structure using **Page Object Model (POM)**, **Data-Driven Testing**, **Allure Reporting**, and **Continuous Integration** via **GitHub Actions**.

### 🔥 Live Allure Report Dashboard  
🔗 **https://debasish-87.github.io/qa-automation-framework-selenium-testng-allure/**

[![Allure_Report](https://img.shields.io/badge/Allure-Report-blue?style=for-the-badge)](https://debasish-87.github.io/qa-automation-framework-selenium-testng-allure/)
[![Build Status](https://img.shields.io/github/actions/workflow/status/Debasish-87/qa-automation-framework-selenium-testng-allure/allure-deploy.yml?label=CI%20Build&style=for-the-badge)](https://github.com/Debasish-87/qa-automation-framework-selenium-testng-allure/actions)

---

## ✅ Key Features

| Feature | Description |
|--------|-------------|
| Selenium Web UI Automation | Automated test coverage for functional UI flows |
| TestNG Test Execution | Parallel test execution + suite grouping |
| Page Object Model (POM) | Clean, modular and maintainable structure |
| Allure Reporting | Rich HTML report with steps, logs & screenshots |
| API Testing (RestAssured) | CRUD operations validation using ReqRes API |
| Data Driven Testing | Supports Excel + JSON data sources |
| Logging (Log4j2) | Centralized test run logging |
| CI/CD Ready | Works with GitHub Actions / Jenkins |

---

## 🏗️ Architecture & Tech Stack

| Layer | Tools |
|------|-------|
| Language | Java |
| Test Runner | TestNG |
| UI Automation | Selenium WebDriver |
| API Testing | RestAssured |
| Reporting | Allure |
| Logging | Log4j2 |
| Build | Maven |
| Data Input | Excel (Apache POI) + JSON (Jackson) |

---

## 📂 Folder Structure

```text

qa-automation-framework-selenium-testng-allure
│
├── pom.xml # Project dependencies & plugins (Selenium, TestNG, Allure, MySQL, WDM, REST-Assured)
├── testng.xml # Test Suite Runner
├── README.md # Project Documentation
│
├── src
│ ├── main
│ │ ├── java
│ │ │ ├── base     # Base + WebDriver Setup Layer
│ │ │ │ ├── BaseTest.java     # Test setup, teardown & driver lifecycle
│ │ │ │ └── DriverManager.java     # Local / Remote driver factory + headless support
│ │ │ │
│ │ │ ├── pages     # Page Object Model (UI Screens)
│ │ │ │ ├── LoginPage.java
│ │ │ │ ├── InventoryPage.java
│ │ │ │ ├── CartPage.java
│ │ │ │ ├── CheckoutInfoPage.java
│ │ │ │ ├── CheckoutOverviewPage.java
│ │ │ │ └── OrderSuccessPage.java
│ │ │ │
│ │ │ ├── utils     # Common Utilities & Helpers
│ │ │ │ ├── WaitUtils.java
│ │ │ │ ├── LoggerUtil.java
│ │ │ │ ├── ScreenshotUtils.java
│ │ │ │ ├── ExcelUtils.java     # Excel Data Provider
│ │ │ │ ├── JsonUtils.java     # JSON Data Provider
│ │ │ │ ├── ConfigReader.java     # config.properties loader
│ │ │ │ └── DatabaseUtils.java     # MySQL DB Integration (Tests read credentials from DB)
│ │ │ │
│ │ │ └── api     # API Service Layer (REST-Assured)
│ │ │ ├── ApiClient.java     # Base request specification
│ │ │ └── ReqResService.java     # Example API service wrapper
│ │ │
│ │ └── resources     # Framework Configurations
│ │ ├── config.properties     # URL, browser, DB connection settings
│ │ ├── environment.properties     # Example env switch support
│ │ └── log4j2.xml     # Logging config
│ │
│ └── test
│ ├── java
│ │ ├── tests
│ │ │ ├── ui     # UI Functional Tests (Selenium + TestNG)
│ │ │ │ ├── LoginTest.java     # Login test using DB + DataProvider
│ │ │ │ └── CheckoutFlowTests.java
│ │ │ │
│ │ │ └── api     # API Tests (REST-Assured + TestNG)
│ │ │ ├── ReqResApiTests.java
│ │ │ └── ReqResTests.java
│ │ │
│ │ └── listeners     # Reporting + Screenshot on Failure
│ │ └── TestListener.java     # Allure Listener
│ │
│ └── resources/testdata     # Data-Driven Testing Files
│ ├── logindata.xlsx     # Excel-based test data
│ └── createUser.json     # JSON test payload
│
├── allure-results     # Allure execution result files (auto-generated)
├── logs     # Framework execution logs
└── .github/workflows     # CI/CD Pipelines
├── ci.yml     # GitHub Actions test pipeline (headless execution + MySQL container)
└── allure-deploy.yml     # Optional: auto-publish Allure report

````

---

##  Test Execution

### Run All Tests:
```bash
mvn clean test
````

### Run in **Headless Mode** (CI/CD mode):

```bash
mvn clean test -Dheadless=true
```

### Generate Allure Report:

```bash
mvn allure:serve
```

---

##  Allure Report Includes

✔ Step-Level Execution Logs
✔ Screenshots on Failure
✔ Execution Timeline
✔ Test History + Trend UI
✔ Environment Metadata

---

##  UI Test Scenarios (SauceDemo)

| Scenario               | Status |
| ---------------------- | ------ |
| Valid User Login       | ✅      |
| Locked User Login      | ✅      |
| Add To Cart            | ✅      |
| Checkout & Place Order | ✅      |

---

##  API Test Scenarios (ReqRes API)

| Endpoint          | Method | Purpose     | Status |
| ----------------- | ------ | ----------- | ------ |
| `/api/users`      | POST   | Create User | ✅      |
| `/api/users/{id}` | GET    | Fetch User  | ✅      |

---

##  Tech Stack

| Layer         | Tool               |
| ------------- | ------------------ |
| Language      | Java 17            |
| Test Runner   | TestNG             |
| UI Automation | Selenium WebDriver |
| API Testing   | RestAssured        |
| Reporting     | Allure Report      |
| Logging       | Log4j2             |
| Build Tool    | Maven              |

---

##  CI/CD - GitHub Actions Workflow

This project automatically:

* Runs tests on every push
* Generates Allure Report
* Publishes Report to `GitHub Pages` branch

Workflow File:

```
.github/workflows/allure-deploy.yml
```

---

##  How to Explain This in an Interview

> “This framework demonstrates end-to-end automation capability including UI + API testing, POM-based architecture, data-driven execution, advanced reporting using Allure, and CI/CD pipeline integration. The report is auto-published to GitHub Pages for real-time visibility.”

---

## 👤 Author

**Debasish** — QA Automation Engineer
📧 Email: [debasishm8765@gmail.com](mailto:debasishm8765@gmail.com)
🔗 GitHub Profile: [https://github.com/Debasish-87](https://github.com/Debasish-87)

---

✨ *If this helped you — give it a star ⭐ on GitHub.*

---
