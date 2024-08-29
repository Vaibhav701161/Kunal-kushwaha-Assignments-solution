package Assignment1;
import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number:");
    double num1 = scanner.nextDouble();
    System.out.println("Enter second number:");
    double num2 = scanner.nextDouble();
    System.out.println("Enter operator (+, -, *, /):");
    char operator = scanner.next().charAt(0);
    double result = 0;

    boolean validOperator =     true;

    if (operator == '+') {
        result = num1 + num2;
    } else if (operator == '-') {
        result = num1 - num2;
    } else if (operator == '*') {
        result = num1 * num2;
    } else if (operator == '/') {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            validOperator = false;
        } else {
            result = num1 / num2;
        }
    } else {
        System.out.println("Error! Invalid operator. Please use (+, -, *, /).");
        validOperator = false;
    }
    if (validOperator){
        System.out.println("Result: " + result);
    }
    scanner.close();
   }
}
