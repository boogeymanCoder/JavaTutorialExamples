import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 1 or 2: ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Thankyou for pressing 1!");
        } else if (num == 2) {
            System.out.println("Thankyou for pressing 2!");
        } else {
            System.out.println("Yayks, please press 1 or 2.");
        }

        System.out.println("Program is exiting...");
    }
}
