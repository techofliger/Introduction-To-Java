# Variables in Java ☕

Java for Beginners • Lesson 1

Variable is a named memory location used to store data in a program.

Simple Hinglish: Variable ek container ki tarah hota hai jisme hum koi value store karte hain, jaise name, age, marks ya price.

## 1. Example of a variable

```
int age = 21;
String name = "Shivam";
double marks = 85.5;
```

Here is what each variable stores:

`int age = 21;`

Stores a whole number: 21

`String name = "Shivam";`

Stores text: Shivam

`double marks = 85.5;`

Stores a decimal number: 85.5

## 2. Types of variables in Java

| Data type | Stores              | Example                       |
| --------- | ------------------- | ----------------------------- |
| `int`     | Whole numbers       | `int age = 21;`               |
| `double`  | Decimal numbers     | `double price = 99.50;`       |
| `char`    | A single character  | `char grade = 'A';`           |
| `boolean` | True or false       | `boolean isStudent = true;`   |
| `String`  | Text                | `String city = "Lucknow";`    |
| `float`   | Decimal numbers     | `float rate = 5.5f;`          |
| `long`    | Large whole numbers | `long population = 8000000L;` |

Remember:

- `char` uses single quotes: `'A'`
- `String` uses double quotes: `"Hello"`
- `float` values normally use `f` at the end, such as `5.5f`.

## 3. Complete Java program

```
public class Main {
    public static void main(String[] args) {

        String name = "Shivam";
        int age = 21;
        double height = 5.4;
        boolean isStudent = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(isStudent);
    }
}
```

Output:

```
Shivam
21
5.4
true
```

## 4. How to create a variable

The basic syntax is:

## `dataType variableName = value;`

Example: `int marks = 90;`

- `int` → data type
- `marks` → variable name
- `90` → value
- `=` → assignment operator
- `;` → ends the statement
