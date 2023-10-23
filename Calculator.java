import java.util.Scanner;

public class Calculator {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero");
            return Double.NaN;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}