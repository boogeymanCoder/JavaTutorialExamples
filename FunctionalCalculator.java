import java.util.Scanner;

public class FunctionalCalculator {
    static int input(String prompt) {
        Scanner in = new Scanner(System.in);

        System.out.print(prompt);
        int value = in.nextInt();

        return value;
    }

    static double solve(int num1, int num2, int operation) {
        double result = 0;

        switch (operation) {
        case 1:
            result = num1 + num2;
            break;
        case 2:
            result = num1 - num2;
            break;
        case 3:
            result = num1 * num2;
            break;
        case 4:
            // when dividing, one value should be double for precise result
            result = (double) num1 / num2; /// transforms num1 into double
            break;
        case 5:
            result = num1 % num2;
            break;
        default:
            System.out.println("Error: Cannot recognize operation.");
        }

        return result;
    }

    static boolean retryPrompt() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to retry? (y/n): ");
        String retryAnswer = sc.next();

        boolean r = retryAnswer.equals("y"); // returns true if retryAnswer equals "y"
        return r;
    }

    public static void main(String[] args) {
        do {
            int number1 = input("Please enter first number: ");
            int number2 = input("Please enter second number: ");
            int opr = input("Please enter operation 1(+), 2(-), 3(*), 4(/), 5(%): ");

            double result = solve(number1, number2, opr);

            System.out.println("The result is: " + result);

        } while (retryPrompt());

    }
}
