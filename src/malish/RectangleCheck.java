package malish;
import java.util.Scanner;

public class RectangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: Malish Shrestha");
        System.out.println("Roll No: 1015\n");

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();


        if (length == breadth) {
            System.out.println("The given dimensions form a square.");
        } else {
            System.out.println("The given dimensions do not form a square.");
        }

        scanner.close();
    }
}
