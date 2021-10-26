
import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input an int: ");
        int int_val = input.nextInt();

        System.out.print("You typed: ");
        System.out.println(int_val);
    }
}
