import java.util.Scanner;

public class TernaryCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 1: ");
        int num = input.nextInt();

        String reply = (num == 1) ? "Thankyou for following my instruction!" : "Yayks, please press 1.";

        System.out.println(reply);

        System.out.println("Program is exiting...");

    }
}
