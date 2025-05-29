package examples;

public class UserInputExample {

    public static void Example() {
        System.out.println("User Input Example");
        System.out.println("====================================");

        @SuppressWarnings("resource")// we don't want to close the STDIN
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.println("====================================");
    }
}
