import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 1: ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Thankyou for following my instruction!");
        }

        System.out.println("Program is exiting...");
    }
}
