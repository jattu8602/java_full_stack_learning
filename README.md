# java_full_stack_learning

## Core Java - OOP Concepts

### 1. Classes and Objects (Encapsulation)

- **Class** = blueprint (`Student`), **Object** = instance (`new Student("Alice", 20, "A")`)
- **Encapsulation**: fields are `private`, accessed via `public` getters/setters
- **Constructor** initializes object state (`this.name = name`)
- File: `core-java/oop/ClassesAndObjects.java`

### 2. Inheritance and Polymorphism

- **Inheritance**: `Dog extends Animal` — child reuses parent fields/methods (`super()` calls parent constructor)
- **Polymorphism**: `Animal myDog = new Dog("Buddy")` — parent reference, child object; `@Override` changes behavior
- **`instanceof`** checks runtime type before casting `((Dog) myDog).wagTail()`
- File: `core-java/oop/InheritanceAndPolymorphism.java`

### 3. Interfaces and Abstract Classes (Abstraction)

- **Abstract class** (`Shape`): can have constructors, fields, concrete + abstract methods. Cannot be instantiated.
- **Interface** (`Drawable`, `Resizable`): pure contract — only abstract methods + `default` methods (Java 8+). A class can `implements` **multiple** interfaces.
- **Key difference**: abstract class has state (fields, constructors), interface doesn't. Use abstract class for "is-a" with shared state, interface for "can-do" capability.
- File: `core-java/oop/InterfacesAndAbstract.java`

### 4. Static and Final Keywords

- **`static`**: belongs to the **class**, not instances. Shared across all objects. Accessed via `ClassName.method()`.
- **`final` variable**: constant, cannot be reassigned. Must be initialized at declaration or in constructor.
- **`static final`**: true compile-time constant (`PI`). Naming convention: `UPPER_SNAKE_CASE`.
- File: `core-java/oop/StaticAndFinal.java`

---

## Core Java - Advanced Topics

### 5. Collections Framework

| Interface | Implementation | Key Trait |
|-----------|---------------|-----------|
| `List` | `ArrayList`, `LinkedList` | Ordered, allows duplicates, indexed |
| `Set` | `HashSet`, `TreeSet` | No duplicates; `TreeSet` = sorted |
| `Map` | `HashMap` | Key-value pairs, unique keys |
| `Queue` | `LinkedList` | FIFO (`offer`/`poll`/`peek`) |

- `Collections.sort()`, `reverse()`, `max()`, `min()` — utility methods
- File: `core-java/advanced/CollectionsDemo.java`

### 6. Lambdas and Streams (Functional Programming)

- **Lambda**: `(a, b) -> a.length() - b.length()` — concise anonymous function
- **Stream API**: declarative data processing pipeline
  - **Intermediate** (lazy): `filter()`, `map()`, `sorted()`
  - **Terminal** (eager): `collect()`, `forEach()`, `sum()`, `reduce()`, `count()`
- **`parallelStream()`**: automatic multi-threading for performance
- File: `core-java/advanced/LambdasAndStreams.java`

### 7. Exception Handling

- **`try`-`catch`-`finally`**: catch specific exceptions, `finally` always executes
- **Multiple catches**: order matters — child first, parent last
- **`try`-with-resources**: auto-closes `AutoCloseable` resources (no `finally` needed)
- **Custom exceptions**: extend `Exception` (checked) or `RuntimeException` (unchecked)
- File: `core-java/advanced/ExceptionHandling.java`

---

## Java Interview Questions

### OOP

**Q: Difference between abstract class and interface?**
- Abstract class: `abstract class` keyword, can have constructors/fields/state, single inheritance only
- Interface: `interface` keyword, no constructors (but can have `default`/`static` methods), multiple inheritance allowed

**Q: How is polymorphism achieved in Java?**
- **Compile-time** (method overloading): same name, different params
- **Runtime** (method overriding): child overrides parent method, resolved at runtime via dynamic method dispatch

**Q: Can you override `static` methods?**
- No — method hiding. The method called depends on the reference type, not the object.

**Q: What is the diamond problem and how does Java solve it?**
- Multiple inheritance of classes causes ambiguity. Java solves it by allowing only single class inheritance but multiple interface inheritance. With `default` methods in interfaces, the class must override the conflicting method.

**Q: Difference between `final`, `finally`, and `finalize`?**
- `final`: keyword — constant variable, non-overridable method, non-inheritable class
- `finally`: block in try-catch that always executes
- `finalize()`: deprecated `Object` method called by GC before reclaiming memory

### Collections

**Q: How does `HashMap` work internally?**
- Uses an array of buckets + linked list / tree. `hashCode()` determines bucket index, `equals()` resolves collisions. Initial capacity 16, load factor 0.75, rehashes when threshold exceeded.

**Q: What's the difference between `ArrayList` and `LinkedList`?**
- `ArrayList`: array-backed, O(1) random access, O(n) insert/delete in middle
- `LinkedList`: doubly-linked list, O(n) random access, O(1) insert/delete at ends

### Exceptions

**Q: What are checked vs unchecked exceptions?**
- **Checked** (compile-time): extend `Exception`, must be caught or declared (`throws`). e.g., `IOException`, `SQLException`
- **Unchecked** (runtime): extend `RuntimeException`, no mandatory handling. e.g., `NullPointerException`, `ArithmeticException`

**Q: What is `try-with-resources`?**
- Auto-closes resources implementing `AutoCloseable`. Resources declared in `try(...)` are closed automatically in reverse order after the block.

### Streams & Lambdas

**Q: Explain Stream API intermediate vs terminal operations.**
- **Intermediate** (return Stream, lazy): `filter`, `map`, `flatMap`, `distinct`, `sorted`
- **Terminal** (trigger execution): `collect`, `forEach`, `reduce`, `count`, `anyMatch`, `findFirst`
- Streams are consumed once — no reuse after terminal op.

---

## How to Run

```bash
# Java 11+ single-file execution
java core-java/basics/HelloWorld.java
java core-java/oop/ClassesAndObjects.java
java core-java/advanced/CollectionsDemo.java

# Or compile first
javac core-java/oop/ClassesAndObjects.java
java -cp core-java/oop ClassesAndObjects
```
