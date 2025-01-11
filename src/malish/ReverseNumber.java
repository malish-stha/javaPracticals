package malish;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the digits
        int reversed = reverseDigits(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }

    // Method to reverse the digits of a number
    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
