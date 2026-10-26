## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# Strategy Design Pattern - Arithmetic Calculator

A clean, modular Java implementation of the **Strategy** behavioral design pattern, developed as an academic assignment. This project demonstrates how to replace complex conditional branching (`if-else` / `switch-case`) with polymorphism.

## Project Structure

```text
strategy-calculator/
├── src/
│   ├── OperationStrategy.java  # Strategy interface
│   ├── AddStrategy.java        # Concrete strategy (Addition)
│   ├── SubtractStrategy.java   # Concrete strategy (Subtraction)
│   ├── MultiplyStrategy.java   # Concrete strategy (Multiplication)
│   ├── Calculator.java         # Context class
│   └── Main.java               # Client execution class
└── README.md

```

## How to Build and Run

### Prerequisites

* Java Development Kit (JDK) installed (version 8 or higher).

### Steps via Terminal:

1. Open your terminal in the project root directory (`strategy-calculator`).
2. Compile all Java source files:
```bash
javac src/*.java

```


3. Run the application:
```bash
java -cp src Main

```



---

## How to Add a New Strategy

Thanks to the Open-Closed Principle, adding a new operation (e.g., Division) requires **zero modifications** to existing classes:

1. **Create a new strategy class** inside the `src/` directory implementing `OperationStrategy`:
```java
public class DivideStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

```


2. **Use it in your client code** (`Main.java`):
```java
calculator.setStrategy(new DivideStrategy());
System.out.println("10 / 5 = " + calculator.calculate(10, 5));

```