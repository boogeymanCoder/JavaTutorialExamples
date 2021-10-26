public class GreaterThanEqual {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;

        boolean isGreaterThanEqual = num1 >= num2;
        System.out.print("num1 >= num2 = ");
        System.out.println(isGreaterThanEqual);

        num1 = 2; // reassigned from 6 to 2
        isGreaterThanEqual = num1 >= num2; // reassigned value
        System.out.print("num1 >= num2 = ");
        System.out.println(isGreaterThanEqual);
    }
}
