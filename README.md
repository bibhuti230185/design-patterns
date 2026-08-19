# Design Patterns in Java

A collection of common **Gang of Four (GoF) design patterns** implemented in Java, organized by category. This project serves as a learning reference for understanding and applying design patterns in real-world scenarios.

## 🛠 Tech Stack

- **Language:** Java
- **Build Tool:** Gradle
- **Testing:** JUnit 5
- **Libraries:** Gson

## 📂 Project Structure

```
src/main/java/org/bibhuti/
├── behavioural/          # Behavioural Design Patterns
├── creational/           # Creational Design Patterns
├── structural/           # Structural Design Patterns
└── mvc/                  # MVC Architectural Pattern
```

## 🔖 Implemented Patterns

### Behavioural Patterns

| Pattern                  | Description                                                                 |
|--------------------------|-----------------------------------------------------------------------------|
| **Chain of Responsibility** | Passes a request along a chain of handlers (e.g., multi-level support).  |
| **Command**              | Encapsulates a request as an object, allowing parameterized operations.     |
| **State**                | Allows an object to change its behaviour when its internal state changes.   |
| **Template Method**      | Defines the skeleton of an algorithm, deferring steps to subclasses.        |

### Creational Patterns

| Pattern              | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| **Factory Method**   | Defines an interface for creating objects, letting subclasses decide the type. |
| **Singleton**        | Ensures a class has only one instance and provides a global access point.    |

### Structural Patterns

| Pattern        | Description                                                                      |
|----------------|----------------------------------------------------------------------------------|
| **Adapter**    | Converts the interface of a class into another interface clients expect.          |
| **Composite**  | Composes objects into tree structures to represent part-whole hierarchies.         |
| **Decorator**  | Attaches additional responsibilities to an object dynamically.                    |
| **Facade**     | Provides a simplified interface to a complex subsystem.                           |
| **Observer**   | Defines a one-to-many dependency so that dependents are notified of changes.      |
| **Proxy**      | Provides a surrogate or placeholder for another object to control access to it.   |

### Architectural Pattern

| Pattern | Description                                                                           |
|---------|---------------------------------------------------------------------------------------|
| **MVC** | Separates an application into Model, View, and Controller components.                 |

## 🚀 Getting Started

### Prerequisites

- **Java 8** or higher
- **Gradle** (or use the included Gradle Wrapper) **or** **Maven**

### Build

#### Using Gradle

```bash
./gradlew build
```

#### Using Maven

```bash
mvn compile
```

### Run Tests

#### Using Gradle

```bash
./gradlew test
```

#### Using Maven

```bash
mvn test
```

### Run a Specific Example

Each pattern has its own example/driver class (e.g., `CommandPatternExample`, `AdapterExample`, `StateExample`). You can run them directly from your IDE or via the command line:

#### Using Gradle

```bash
./gradlew run -PmainClass=org.bibhuti.behavioural.command.CommandPatternExample
```

#### Using Maven

```bash
mvn exec:java -Dexec.mainClass="org.bibhuti.behavioural.command.CommandPatternExample"
```

## 📖 Pattern Examples at a Glance

- **Chain of Responsibility** — A tiered support system where requests escalate through Level 1 → Level 2 → Level 3 handlers.
- **Command** — A remote control that encapsulates TV/Stereo operations as command objects, plus a contact management example.
- **State** — A vending machine that transitions between Ready, Product Selected, Payment Pending, and Out of Stock states.
- **Template Method** — A beverage maker where Coffee and Tea share a common preparation algorithm with customizable steps.
- **Factory Method** — A knife store that delegates knife creation to subclasses.
- **Singleton** — A classic single-instance pattern implementation.
- **Adapter** — Adapts a web service interface for use by a web client.
- **Composite** — Models a housing structure composed of rooms using a tree hierarchy.
- **Decorator** — Adds milk and sugar decorations to a plain coffee dynamically.
- **Facade** — Simplifies banking operations behind a `BankService` facade.
- **Observer** — A weather station that notifies display components of condition changes.
- **Proxy** — A warehouse proxy that controls and manages access to order items.

## 📝 License

This project is for educational purposes.


