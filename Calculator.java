import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Please enter operation 1(+), 2(-), 3(*), 4(/), 5(%): ");
        int operation = input.nextInt();

        double result = 0;

        if (operation > 0 && operation < 6) {
            if (operation == 1) {
                result = num1 + num2;
            } else if (operation == 2) {
                result = num1 - num2;
            } else if (operation == 3) {
                result = num1 * num2;
            } else if (operation == 4) {
                // when dividing, one value should be double for precise result
                result = (double) num1 / num2; /// transforms num1 into double
            } else if (operation == 5) {
                result = num1 % num2;
            }

            System.out.print("The result is: ");
            System.out.println(result);
        } else {
            System.out.println("Error: Cannot recognize operation.");
        }
    }
}
