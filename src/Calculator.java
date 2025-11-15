import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SIMPLE CALCULATOR ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();

        System.out.print("Enter number 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double b = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
