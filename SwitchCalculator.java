import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Please enter operation 1(+), 2(-), 3(*), 4(/), 5(%): ");
        int operation = input.nextInt();

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

        System.out.print("The result is: ");
        System.out.println(result);
    }
}
