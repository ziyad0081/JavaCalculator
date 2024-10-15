# SimpleCalculator

A basic command-line calculator for performing arithmetic operations like addition, subtraction, multiplication, and division.

## Usage

### Run the calculator:

```java
java -jar SimpleCalculator.jar [operator] [num1] [num2]
```

### Operators:
- `+` for addition
- `-` for subtraction
- `x` or `*` for multiplication
- `/` for division (division by zero is not allowed)

### Show Help:
To display a help guide, use the `-i` flag:

```java
java -jar SimpleCalculator.jar -i
```

## Examples

- **Addition**:
```java
java -jar SimpleCalculator.jar + 5 3
```
Output: `Result is 8.0`

- **Subtraction**:
```java
java -jar SimpleCalculator.jar - 5 3
```
Output: `Result is 2.0`

- **Multiplication**:
```java
java -jar SimpleCalculator.jar x 5 3
```
Output: `Result is 15.0`

- **Division**:

```java
java -jar SimpleCalculator.jar / 5 10
```
Output: `Result is 0.5`

## Error Handling

- **Invalid operation**: If an invalid operator is used, you will see an error message.
- **Non-numeric input**: If you input something other than a number, an error will be thrown.
- **Division by zero**: An error will be shown for division by zero.
