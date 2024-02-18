# Design Pattern in JAVA

## Behavioral Patterns

### Template Method

> The Template Method Design Pattern is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure

> The pattern consists of a template method in the superclass, which contains the algorithm's structure and invokes abstract methods or hooks that are implemented by subclasses.

> **Hooks** are commonly used in design patterns such as the **Template Method** pattern and the **Observer** pattern. In the **Template Method** pattern, hooks are methods in an abstract class that have default implementations, providing extension points for subclasses to customize certain steps of an algorithm. In the **Observer** pattern, hooks are callback methods that subscribers implement to receive notifications when the state of an object changes.

> It promotes code reuse and helps to maintain a consistent structure across different implementations.

## Creational Patterns

### Singleton

> The Singleton pattern is a creational design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance. In other words, it ensures that a class has only one instance and provides a mechanism for accessing that instance throughout the application.

> **Misuse - Reflection** : using reflection JAVA can set the private constructor to become accessible at runtime with getDeclaredConstructor of class. To fix this, use private constructor of the Singleton class

> **Misuse - Clone** : Java generate clone instance with hash code of original instance. it doesn't match with the original object. To prevent this, override the clone method and throw CloneNotSupportedExcpetion for example.

> **Misuse - Serialization** : when JAVA serialize an object and deserialize it again, there are different hash code values for instance ObjectOutputStream / ObjectInputStream. To prevent this, implement readResolve() method and return current instance of class.

## Structural Patterns
