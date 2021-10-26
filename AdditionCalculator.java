import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.print("The sum is: ");
        System.out.println(sum);
    }
}
