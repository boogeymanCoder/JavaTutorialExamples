public class Continue {
    public static void main(String[] args) {
        // ++ ang increment operator can be placed before or after the variable
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                continue;
            }
            System.out.println("Doing Operations with i = " + i);
        }
    }
}
