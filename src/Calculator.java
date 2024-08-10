import java.util.Scanner;

public class Calculator {
    private Operations operations;
    private Scanner scanner;

    public Calculator() {
        operations = new Operations();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (option) {
                case 1:
                    System.out.println("Result: " + operations.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + operations.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + operations.multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + operations.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Option: ");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
