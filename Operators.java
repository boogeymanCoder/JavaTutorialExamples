public class Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.print("x = ");
        System.out.println(x);

        System.out.print("y = ");
        System.out.println(y);

        ++x;
        System.out.print("after ++x, x = ");
        System.out.println(x);

        --x;
        System.out.print("after --x, x = ");
        System.out.println(x);

        int sum = x + y;
        System.out.print("sum = ");
        System.out.println(sum);

        int difference = x - y;
        System.out.print("difference = ");
        System.out.println(difference);

        int product = x * y;
        System.out.print("product = ");
        System.out.println(product);

        double quotient = (double) x / 3; // transforms x into double datatype
        System.out.print("quotient = ");
        System.out.println(quotient);

    }
}
