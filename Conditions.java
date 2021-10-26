public class Conditions {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;

        System.out.print("num1 = ");
        System.out.println(num1);

        System.out.print("num2 = ");
        System.out.println(num2);

        boolean isLessThan = num1 < num2;
        System.out.print("num1 < num2 = ");
        System.out.println(isLessThan);

        boolean isLessThanOrEqual = num1 <= num2;
        System.out.print("num1 <= num2 = ");
        System.out.println(isLessThanOrEqual);

        boolean isGreaterThan = num1 > num2;
        System.out.print("num1 > num2 = ");
        System.out.println(isGreaterThan);

        boolean isGreaterThanOrEqual = num1 >= num2;
        System.out.print("num1 >= num2 = ");
        System.out.println(isGreaterThanOrEqual);

        boolean isEqual = num1 == num2;
        System.out.print("num1 == num2 = ");
        System.out.println(isEqual);

        boolean isNotEqual = num1 != num2;
        System.out.print("num1 != num2 = ");
        System.out.println(isNotEqual);
    }
}
