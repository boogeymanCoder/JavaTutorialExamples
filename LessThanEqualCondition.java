public class LessThanEqualCondition {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;

        boolean isLessThanOrEqual = num1 <= num2;
        System.out.print("num1 <= num2 = ");
        System.out.println(isLessThanOrEqual);

        num2 = 6; // reassigned value from 2 to 6

        isLessThanOrEqual = num1 <= num2; // reassigned value
        System.out.print("num1 <= num2 = ");
        System.out.println(isLessThanOrEqual);
    }
}
