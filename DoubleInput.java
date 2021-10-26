
import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a double: ");
        double db_val = input.nextDouble();

        System.out.print("You typed: ");
        System.out.println(db_val);
    }
}
