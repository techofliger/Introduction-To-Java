# Conditional Statements in Java

Definition: Conditional statements in Java are used to make decisions in a program. They execute different blocks of code depending on whether a condition is `true` or `false`.

Example: If a student scores  passing marks, print "Pass"; otherwise, print "Fail".

## Types of Conditional Statements

## 1

if Statement

Executes a block of code when the condition is true.

```
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

Output: Eligible to vote

## 2

if-else Statement

Executes one block if true and another if false.

```
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

Output: Odd

## 3

if-else-if Ladder

Checks multiple conditions one by one.

```
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 80) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else {
    System.out.println("Fail");
}
```

Output: Grade A

## 4

Nested if Statement

An `if` statement inside another `if` statement.

```
int age = 21;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry allowed");
    }
}
```

Output: Entry allowed

## 5

switch Statement

Selects one option from multiple cases.

```
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

Output: Tuesday

## 6. Ternary Operator (`? :`)

A short way to write a simple `if-else` statement.

```
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);
```

Output: `Adult`

## Comparison Table

| Statement     | Purpose                                     |
| ------------- | ------------------------------------------- |
| `if`          | Checks one condition                        |
| `if-else`     | Chooses between two options                 |
| `if-else-if`  | Checks multiple conditions                  |
| Nested `if`   | Checks a condition inside another condition |
| `switch`      | Selects from multiple cases                 |
| Ternary `? :` | Short form of `if-else`                     |

## Important Operators

\| Operator | Meaning | Example |\
\|---|---|---|\
\| `==` | Equal to | `a == b` |\
\| `!=` | Not equal to | `a != b` |\
\| `>` | Greater than | `a > b` |\
\| `<` | Less than | `a < b` |\
\| `>=` | Greater than or equal to | `a >= b` |\
\| `<=` | Less than or equal to | `a <= b` |\
\| `&&` | Logical AND | Both conditions true |\
\| `||` | Logical OR | At least one condition true |\
\| `!` | Logical NOT | Reverses the condition |
