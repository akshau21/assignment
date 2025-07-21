
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for a String
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // Input for an Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Input for a Double
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.println("\nSummary:");
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        scanner.close();
    }
}
