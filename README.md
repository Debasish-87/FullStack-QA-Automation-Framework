# Full-Stack QA Automation Framework ( QE 1.0 )

## *( Selenium + TestNG + POM + Allure Reporting + API + Database + CI/CD with GitHub Pages Dashboard )*


This is a **Production-Grade** Automation Framework  ( QE 1.0 ) designed for **UI + API Testing + Database Testing** with a clean, modular structure using **Page Object Model (POM)**, **Data-Driven Testing**, **Allure Reporting**, and **Continuous Integration** via **GitHub Actions**.

### 🔥 Live Allure Report Dashboard   ( QE 1.0 )
🔗 **[https://debasish-87.github.io/FullStack-QA-Automation-Framework/](https://debasish-87.github.io/FullStack-QA-Automation-Framework/)**

[![Allure_Report](https://img.shields.io/badge/Allure-Report-blue?style=for-the-badge)](https://debasish-87.github.io/FullStack-QA-Automation-Framework/)
[![Build Status](https://img.shields.io/github/actions/workflow/status/Debasish-87/FullStack-QA-Automation-Framework/allure-deploy.yml?label=CI%20Build&style=for-the-badge)](https://github.com/Debasish-87/FullStack-QA-Automation-Framework/actions)

---

## 🎥 QE 3.0 – Intelligent Release Decision Demo

▶️ **Click below to watch the demo video**

https://github.com/user-attachments/assets/4e598767-28ab-4291-972b-4a8f1a818b53

---


## ✅ Key Features ( QE 1.0 )

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

## 🏗️ Architecture & Tech Stack  ( QE 1.0 )

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

## 📂 Folder Structure  ( QE 1.0 )

```text

FullStack-QA-Automation-Framework
│
├── pom.xml                         # Dependencies & Plugins
├── testng.xml                      # Test Suite Runner
├── README.md                       # Project Documentation
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base                # WebDriver Setup Layer
│   │   │   │   ├── BaseTest.java
│   │   │   │   └── DriverManager.java
│   │   │   │
│   │   │   ├── pages               # Page Object Model Classes
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── InventoryPage.java
│   │   │   │   ├── CartPage.java
│   │   │   │   ├── CheckoutInfoPage.java
│   │   │   │   ├── CheckoutOverviewPage.java
│   │   │   │   └── OrderSuccessPage.java
│   │   │   │
│   │   │   ├── utils               # Utilities (Common Helpers)
│   │   │   │   ├── WaitUtils.java
│   │   │   │   ├── LoggerUtil.java
│   │   │   │   ├── ScreenshotUtils.java
│   │   │   │   ├── ExcelUtils.java
│   │   │   │   ├── JsonUtils.java
│   │   │   │   ├── ConfigReader.java      # Reads config.properties
│   │   │   │   └── DatabaseUtils.java     # MySQL Database Connection + Queries
│   │   │   │
│   │   │   └── api                 # API Testing Layer (REST-Assured)
│   │   │       ├── ApiClient.java
│   │   │       └── ReqResService.java
│   │   │
│   │   └── resources               # Configuration Files
│   │       ├── config.properties   # App URLs, browser, DB credentials
│   │       ├── environment.properties
│   │       └── log4j2.xml          # Logging Configuration
│   │
│   └── test
│       ├── java
│       │   ├── tests
│       │   │   ├── ui              # UI Test Cases (Selenium + TestNG)
│       │   │   │   ├── LoginTest.java
│       │   │   │   └── CheckoutFlowTests.java
│       │   │   │
│       │   │   └── api             # API Test Cases (REST-Assured)
│       │   │       ├── ReqResApiTests.java
│       │   │       └── ReqResTests.java
│       │   │
│       │   └── listeners           # Screenshot & Logging Listeners
│       │       └── TestListener.java
│       │
│       └── resources/testdata      # Test Data Files
│           ├── logindata.xlsx
│           └── createUser.json
│
├── allure-results                  # Allure raw execution result files
├── logs                            # Framework execution logs
└── .github/workflows               # CI/CD pipelines
    ├── ci.yml
    └── allure-deploy.yml

````

---

##  Test Execution  ( QE 1.0 )

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

##  Allure Report Includes  ( QE 1.0 )

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

## Who is this for?
This framework demonstrates real-world SDET practices used in product companies:
- UI + API automation
- CI/CD-integrated testing
- Cloud-ready test execution
- Scalable and maintainable architecture

Designed for production-grade automation, not demo testing.

---

## 👤 Author

**Debasish** — QA Automation | Cloud DevOps Engineer
📧 Email: [debasishm8765@gmail.com](mailto:debasishm8765@gmail.com)
🔗 GitHub Profile: [https://github.com/Debasish-87](https://github.com/Debasish-87)

---

✨ *If this helped you — give it a star ⭐ on GitHub.*

---
