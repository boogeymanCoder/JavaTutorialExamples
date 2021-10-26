import java.util.Scanner;

public class ElseCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 1: ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Thankyou for following my instruction!");
        } else {
            System.out.println("Yayks, please press 1.");
        }

        System.out.println("Program is exiting...");

    }
}
