# SOLID Principles Java Lab

This project exemplifies the five SOLID principles applied in Java, showing how each can be implemented and which patterns are used to reinforce good design practices.

## 1. Single Responsibility Principle (SRP)

**Classes:** Invoice, InvoicePrinter, InvoiceRepository.

**Description:** Each class has a single responsibility: `Invoice` models the invoice, `InvoicePrinter` handles printing, and `InvoiceRepository` handles saving. This avoids mixing logic and makes maintenance easier.

## 2. Open/Closed Principle (OCP)

**Classes:** DiscountCalculator, DiscountStrategy, RegularDiscountStrategy, VIPDiscountStrategy.

**Description:** `DiscountCalculator` is open to new discount strategies without modifying its code, thanks to the `DiscountStrategy` interface. New strategies can be added by extending the interface.
**Pattern used:** Strategy.

## 3. Liskov Substitution Principle (LSP)

**Classes:** Vehicle, Refuelable, Rechargeable, HybridCar, GasolineCar, ElectricCar.

**Description:** Vehicle classes (`HybridCar`, `GasolineCar`, `ElectricCar`) implement interfaces according to their capabilities, allowing objects to be substituted without breaking program logic.

## 4. Interface Segregation Principle (ISP)

**Classes:** Workable, Eatable, Developer, OfficeWorker, Robot.

**Description:** Interfaces are split into `Workable` and `Eatable` so classes implement only the methods they need. Example: `Developer` and `Robot` only work, `OfficeWorker` works and eats.

## 5. Dependency Inversion Principle (DIP)

**Classes:** Database, MySQLDatabase, MongoDatabase, OrderProcessor.

**Description:** `OrderProcessor` depends on the abstraction `Database`, allowing the database (MySQL, MongoDB) to be changed without modifying processing logic.

---

Each principle is accompanied by unit tests to validate its functionality and ensure design quality.

## Technologies Used

- **Java:** 21
- **Maven:** (dependency and build manager)
- **JUnit Jupiter:** 5.7.1 (unit testing)
- **JaCoCo:** 0.8.11 (code coverage)

## Commands to Run Unit Tests

From the project root, run:

```sh
mvn clean test
```

To generate the code coverage report with JaCoCo:

```sh
mvn jacoco:report
```

The coverage report can be viewed at `target/site/jacoco/index.html`.

---

## Unit test results

<img width="2879" height="1692" alt="Captura de pantalla 2026-02-13 211640" src="https://github.com/user-attachments/assets/68b6e0f9-7846-4f8c-83cb-dfe351ad7d65" />

## Coverage - Jacoco

<img width="2879" height="921" alt="Captura de pantalla 2026-02-13 212149" src="https://github.com/user-attachments/assets/d8d3f027-f7a4-48f7-aedc-2015b3fc20f2" />
