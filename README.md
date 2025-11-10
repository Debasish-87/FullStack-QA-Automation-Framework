# QA Automation Framework (Selenium + TestNG + Allure + API + CI/CD + GitHub Pages)

This is a **Production-Grade** Automation Framework designed for **UI + API Testing** with a clean, modular structure using **Page Object Model (POM)**, **Data-Driven Testing**, **Allure Reporting**, and **Continuous Integration** via **GitHub Actions**.

### 🔥 Live Allure Report Dashboard  
🔗 **https://debasish-87.github.io/qa-automation-framework-selenium-testng-allure/**

[![Allure_Report](https://img.shields.io/badge/Allure-Report-blue?style=for-the-badge)](https://debasish-87.github.io/qa-automation-framework-selenium-testng-allure/)
[![Build Status](https://img.shields.io/github/actions/workflow/status/Debasish-87/qa-automation-framework-selenium-testng-allure/allure-deploy.yml?label=CI%20Build&style=for-the-badge)](https://github.com/Debasish-87/qa-automation-framework-selenium-testng-allure/actions)

---

##  Key Features

| Feature | Status | Description |
|--------|--------|-------------|
| Selenium UI Automation | ✅ | UI Workflow Automation for SauceDemo |
| API Testing (RestAssured) | ✅ | CRUD + Data Verification using ReqRes API |
| TestNG Framework | ✅ | Parallel execution + Suite-level config |
| Page Object Model | ✅ | Clean, reusable maintainable structure |
| Data-Driven Testing | ✅ | Test data from **Excel + JSON** |
| WebDriverManager | ✅ | Auto Driver setup (No manual .exe needed) |
| Allure Report | ✅ | Screenshot on failure + Test Steps + Trends |
| CI/CD Ready | ✅ | Automated Execution via GitHub Actions |
| GitHub Pages Deployment | ✅ | Live Hosted Allure Dashboard |

---

## 🏗️ Architecture Diagram

```

qa-automation-framework-selenium-testng-allure
│
├── pom.xml                        # Project dependencies & plugins
├── testng.xml                     # Test Suite Runner
├── README.md                      # Project Documentation
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base               # BaseTest & WebDriver Manager
│   │   │   │   ├── BaseTest.java
│   │   │   │   └── DriverManager.java
│   │   │   │
│   │   │   ├── pages              # Page Object Model Classes
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── InventoryPage.java
│   │   │   │   ├── CartPage.java
│   │   │   │   ├── CheckoutInfoPage.java
│   │   │   │   ├── CheckoutOverviewPage.java
│   │   │   │   └── OrderSuccessPage.java
│   │   │   │
│   │   │   ├── utils              # Common Utilities
│   │   │   │   ├── WaitUtils.java
│   │   │   │   ├── LoggerUtil.java
│   │   │   │   ├── ScreenshotUtils.java
│   │   │   │   ├── ExcelUtils.java
│   │   │   │   └── JsonUtils.java
│   │   │   │
│   │   │   └── api                # API Client + Service Layer
│   │   │       ├── ApiClient.java
│   │   │       └── ReqResService.java
│   │   │
│   │   └── resources              # Configurations
│   │       ├── config.properties
│   │       ├── environment.properties
│   │       └── log4j2.xml
│   │
│   └── test
│       ├── java
│       │   ├── tests
│       │   │   ├── ui              # UI Test Cases
│       │   │   │   ├── LoginTest.java
│       │   │   │   └── CheckoutFlowTests.java
│       │   │   │
│       │   │   └── api             # API Test Cases
│       │   │       ├── ReqResApiTests.java
│       │   │       └── ReqResTests.java
│       │   │
│       │   └── listeners           # Screenshot + Logging Listener
│       │       └── TestListener.java
│       │
│       └── resources/testdata      # Test Data (Excel + JSON)
│           ├── logindata.xlsx
│           └── createUser.json
│
├── allure-results                  # Allure raw execution logs
├── logs                            # Execution logs
└── .github/workflows               # CI/CD pipelines
    ├── ci.yml
    └── allure-deploy.yml


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

```

