import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();

        switch (choice) {
            case 1:
                System.out.println("Result: " + a.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + s.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + m.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + d.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid Input");
        }

        scanner.close();
    }


}
