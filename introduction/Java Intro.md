# Introduction to Java

## 1. What is Java?

Java is a high-level, general-purpose, class-based, object-oriented programming language. It was originally developed by James Gosling and his team at Sun Microsystems and released in 1995. Java is now maintained by Oracle and the broader Java community.

Java is widely used to build web applications, enterprise software, backend services, desktop applications, and Android applications.

## 2. Features of Java

- **Simple:** Java has a readable syntax influenced by C and C++.
- **Object-oriented:** Programs can be organized using classes and objects.
- **Platform-independent:** Java bytecode can run on any compatible Java Virtual Machine (JVM).
- **Secure:** Java includes runtime checks and security features.
- **Robust:** Strong type checking, exception handling, and memory management help build reliable applications.
- **Multithreaded:** Java supports executing multiple threads concurrently.
- **Portable:** Java provides consistent behavior across supported platforms.
- **Automatic memory management:** The garbage collector helps reclaim memory that is no longer needed.

## 3. How Java Works

Java source code is saved in a `.java` file. The Java compiler converts it into bytecode, which the JVM executes.

```text
Java Source Code (.java)
          |
          v
     Java Compiler
        (javac)
          |
          v
    Bytecode (.class)
          |
          v
 Java Virtual Machine (JVM)
          |
          v
        Output
```

## 4. JDK, JRE, and JVM

| Component | Description |
|---|---|
| JDK | Java Development Kit. Includes tools for developing and compiling Java programs. |
| JRE | Java Runtime Environment. Refers to the components needed to run Java applications. |
| JVM | Java Virtual Machine. Executes Java bytecode. |

**Note:** Modern Java distributions may not provide a separate JRE download. Installing a JDK is generally the recommended option for learning Java.

## 5. Your First Java Program

Create a file named `HelloWorld.java`.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Output

```text
Hello, World!
```

### Explanation

- `public class HelloWorld` declares a class named `HelloWorld`.
- `public static void main(String[] args)` declares the main method, which the Java launcher uses as the program entry point.
- `System.out.println()` prints a message followed by a new line.
- Curly braces `{}` define a block of code.
- The semicolon `;` marks the end of a statement.

**Important:** The filename must be `HelloWorld.java` because the program declares a public class
