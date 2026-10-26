# Assignment Report: Strategy Behavioral Design Pattern

## 1. Introduction — Chosen Domain and Algorithm Family
* **Domain:** Arithmetic Calculator.
* **Algorithm Family:** A family of mathematical binary operations encapsulated as interchangeable strategies (`AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`). 
* **Justification:** The calculator domain provides a simple, textbook example where multiple algorithmic variants perform parallel tasks on identical inputs, making it ideal for demonstrating the elimination of branching conditional statements via polymorphism.

---

## 2. UML Class Diagram
![uml.png]
---

## 3. Clean Code Section
1. **Elimination of Conditional Logic:** Replaced nested `if-else` or `switch-case` statements in the client/context layer with polymorphic dispatch through the `OperationStrategy` interface.
2. **Meaningful, Intention-Revealing Names:** Classes and methods (`AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `execute`) clearly state their precise purpose without requiring documentation.
3. **Single Responsibility Principle (SRP):** Each strategy class encapsulates exactly one mathematical algorithm. Modifications to addition logic do not impact subtraction or multiplication.
4. **Algorithm-Agnostic Context:** The `Calculator` context class only maintains a reference to the `OperationStrategy` interface and delegates calls blindly, remaining entirely decoupled from concrete operation implementations.
5. **Easy Extensibility:** New operations (e.g., `DivideStrategy`) can be added by creating a new class implementing `OperationStrategy` without altering existing code.

---

## 4. Strategy vs. State
While both patterns rely on composition and delegation, they serve fundamentally different design intents:
* **Strategy Pattern:** Represents *how* a task is accomplished. Algorithms are interchangeable, and the client typically drives strategy selection or runtime switching based on external inputs.
* **State Pattern:** Represents *what* behavior an object exhibits based on its internal state, and states frequently manage transitions to other states autonomously. 
In our calculator domain, the math operations are stateless and chosen independently by the user/client at runtime, which perfectly aligns with the **Strategy** pattern rather than State.

---

## 5. Conclusion
Implementing the Strategy pattern introduced slight class bloat by creating separate files for each operation, but the architectural benefits vastly outweigh this. We achieved robust open-closed principles, eliminated fragile conditional branching blocks, and enabled seamless runtime flexibility.

---

## 6. GitHub Repository
[Link to GitHub Repository](https://github.com/Sanzh-123/assignment-5-strategy-pattern)

[def]: uml.png