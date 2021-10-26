
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a String: ");
        String str_val = input.nextLine();

        System.out.print("You typed: ");
        System.out.println(str_val);
    }
}
