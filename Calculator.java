import java.util.Scanner;

public class Calculator {

    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
              return a + b;
            case '-':
              return a - b;
            case '*': 
              return a * b;
            case '/':
            {
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return 0;
                }
                return a / b;
            }
            default:
                System.out.println("Invalid operator.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean temp = true;

        System.out.println("==== Java Console Calculator ====");

        while (temp) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);

            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                temp = false;
            }
        }

        System.out.println("Calculator End");
    }
}