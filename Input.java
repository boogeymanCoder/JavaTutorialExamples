
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a String: ");
        String str_val = input.nextLine();

        System.out.print("You typed: ");
        System.out.println(str_val);

        System.out.print("Please input an int: ");
        int int_val = input.nextInt();

        System.out.print("You typed: ");
        System.out.println(int_val);

        System.out.print("Please input a double: ");
        double db_val = input.nextDouble();

        System.out.print("You typed: ");
        System.out.println(db_val);

        System.out.print("Please input a boolean: ");
        boolean bol_val = input.nextBoolean();

        System.out.print("You typed: ");
        System.out.println(bol_val);
    }
}
