# SOLID Principles Java Lab

This project exemplifies the five SOLID principles applied in Java, showing how each can be implemented and which patterns are used to reinforce good design practices.

## 1. Single Responsibility Principle (SRP)

**Classes:** Invoice, InvoicePrinter, InvoiceRepository
**Description:** Each class has a single responsibility: `Invoice` models the invoice, `InvoicePrinter` handles printing, and `InvoiceRepository` handles saving. This avoids mixing logic and makes maintenance easier.

## 2. Open/Closed Principle (OCP)

**Classes:** DiscountCalculator, DiscountStrategy, RegularDiscountStrategy, VIPDiscountStrategy
**Description:** `DiscountCalculator` is open to new discount strategies without modifying its code, thanks to the `DiscountStrategy` interface. New strategies can be added by extending the interface.
**Pattern used:** Strategy.

## 3. Liskov Substitution Principle (LSP)

**Classes:** Vehicle, Refuelable, Rechargeable, HybridCar, GasolineCar, ElectricCar
**Description:** Vehicle classes (`HybridCar`, `GasolineCar`, `ElectricCar`) implement interfaces according to their capabilities, allowing objects to be substituted without breaking program logic.

## 4. Interface Segregation Principle (ISP)

**Classes:** Workable, Eatable, Developer, OfficeWorker, Robot
**Description:** Interfaces are split into `Workable` and `Eatable` so classes implement only the methods they need. Example: `Developer` and `Robot` only work, `OfficeWorker` works and eats.

## 5. Dependency Inversion Principle (DIP)

**Classes:** Database, MySQLDatabase, MongoDatabase, OrderProcessor
**Description:** `OrderProcessor` depends on the abstraction `Database`, allowing the database (MySQL, MongoDB) to be changed without modifying processing logic.

---

Each principle is accompanied by unit tests to validate its functionality and ensure design quality.
