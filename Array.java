public class Array {
    public static void main(String[] args) {
        String[] names = { "John", "Glaiza", "Fanny" };

        System.out.println("The array length is: " + names.length);

        System.out.println("The names are: " + names); // Can't be printed like normal variable
        System.out.println("Each names are: " + names[0] + ", " + names[1] + ", " + names[2]);

        names[1] = "Irene";
        System.out.println("\nAfter Changing names[1]");
        System.out.println("Each names are: " + names[0] + ", " + names[1] + ", " + names[2]);
    }
}
