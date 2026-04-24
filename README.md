# StoreStock

Simple Java OOP project for basic store stock management.

## Overview

`StoreStock` simulates a small store system where you can:
- add and display products
- add and display distributors (sorted)
- add categories and employees
- search products by name
- record stock transactions (`IN` / `OUT`)
- view transaction history

The app currently runs from `Main.java` with sample data.

## Technologies

- Java
- OOP concepts: abstraction, inheritance, polymorphism, collections, `Comparable`

## Project Structure

- `Product` (abstract base class)
- `FoodProduct` and `ElectronicProduct` (inherit from `Product`)
- `Distributor` (`Comparable` for alphabetical sorting)
- `Category`
- `Employee`
- `Transaction`
- `StoreService` (business logic)
- `Main` (entry point / demo flow)
- `Warehouse` (basic model class)

## How To Run

From the `StoreStock` folder:

```powershell
javac src\*.java
java -cp src Main
```

## Example Flow in Main

`Main` demonstrates the following actions:
1. populate initial data (categories, employee, products, distributors)
2. display products, distributors, categories
3. search for a product (`Milk`)
4. record transactions (`OUT` for Milk, `IN` for TV)
5. display transaction history and updated stock

## Notes

- Distributor sorting is done through a `TreeSet<Distributor>`.
- Product display uses polymorphism via `displayDetails()`.
- `recordTransaction` prevents `OUT` operations when stock is insufficient.
