
import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a boolean: ");
        boolean bol_val = input.nextBoolean();

        System.out.print("You typed: ");
        System.out.println(bol_val);
    }
}
