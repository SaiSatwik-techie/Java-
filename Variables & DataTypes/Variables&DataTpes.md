# Variables and Data Types in Java

## 1. What is a Variable in Java?

A variable is a name given to a memory location used to store data in a program.

For example, if we want to store a student's age, we can create a variable called `age`.

```
int age = 20;
```

Here:

- `int` specifies the type of data.
- `age` is the variable name.
- `20` is the value stored in the variable.

## 2. How to Declare a Variable

The basic syntax for declaring a variable is:

```
dataType variableName = value;
```

Example:

```
int age = 20;
String name = "Ravi";
double salary = 25000.50;
```

In this example, we store a person's age, name, and salary in three different variables.

## 3. What Are Data Types in Java?

A data type specifies what kind of value a variable can store, such as a number, a decimal value, a character, or text.

Java data types are divided into two main categories.

1\. Primitive Data Types

These are the basic built-in data types in Java, such as `int`, `char`, and `boolean`.

2\. Non-Primitive Data Types

These include types such as `String`, arrays, and classes. They are used to represent text, collections of values, and more complex data.

## 4. Primitive Data Types in Java

Java has eight primitive data types.

| Data type | Used for             | Example                  |
| --------- | -------------------- | ------------------------ |
| `byte`    | Small whole numbers  | `byte a = 10;`           |
| `short`   | Whole numbers        | `short b = 1000;`        |
| `int`     | Whole numbers        | `int age = 20;`          |
| `long`    | Large whole numbers  | `long n = 90000L;`       |
| `float`   | Decimal numbers      | `float x = 5.5f;`        |
| `double`  | Decimal numbers      | `double price = 99.99;`  |
| `char`    | A single character   | `char grade = 'A';`      |
| `boolean` | True or false values | `boolean passed = true;` |

Remember:

- Use `int` for common whole numbers.
- Use `double` for common decimal numbers.
- Use `char` for a single character, written in single quotes.
- Use `String` for text, written in double quotes.
- Use `boolean` for `true` or `false`.

## 5. Non-Primitive Data Types

Some common non-primitive data types are:

String: Stores text.

```
String name = "Ravi";
```

Array: Stores multiple values of the same declared type.

```
int[] marks = {80, 90, 75};
```

Class: Defines the structure and behavior of objects.

```
class Student {
    String name;
    int age;
}
```

## 6. Complete Example

```
class Main {
    public static void main(String[] args) {
        int age = 20;
        double marks = 85.5;
        char grade = 'A';
        String name = "Ravi";
        boolean passed = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
        System.out.println(passed);
    }
}
```

Output:

```
Ravi
20
85.5
A
true
```

## 7. Difference Between Variables and Data Types

| Variable                     | Data type                                       |
| ---------------------------- | ----------------------------------------------- |
| Stores a value under a name. | Specifies the kind of value that can be stored. |
| Example: `age`               | Example: `int`                                  |
| Its value can change.        | It determines which values are allowed.         |

For example, in `int age = 20;`, `age` is the variable, `int` is the data type, and `20` is the value.

In simple words: A variable is a named place to store a value, and a data type tells Java what kind of value it can hold.
