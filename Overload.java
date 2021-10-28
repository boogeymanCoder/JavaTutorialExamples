public class Overload {
    static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    static void sayHello(String name1, String name2) {
        System.out.println("Hello " + name1 + " and " + name2 + "!");
    }

    public static void main(String[] args) {
        sayHello("John");
        sayHello("Glaiza", "Fanny");
    }
}
